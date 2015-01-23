package de.tu_bs.cs.isf.mbse.Ernaehrungsplan.generator;

import com.google.common.base.Objects;
import de.tu_bs.cs.isf.mbse.Ernaehrungsplan.EpElement;
import de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Ernaehrungsplan;
import de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Gericht;
import de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Gericht2Zutat;
import de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Person;
import de.tu_bs.cs.isf.mbse.Ernaehrungsplan.Zutat;
import de.tu_bs.cs.isf.mbse.Ernaehrungsplan.generator.GeneratePDF;
import de.tu_bs.cs.isf.mbse.Ernaehrungsplan.generator.ModelLoader;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.ExclusiveRange;
import org.eclipse.xtext.xbase.lib.InputOutput;

@SuppressWarnings("all")
public class M2T {
  private ModelLoader loader = new ModelLoader();
  
  private List<Ernaehrungsplan> eplans;
  
  private List<Gericht> meals;
  
  private List<Gericht> salads;
  
  private EpElement epElement;
  
  private File targetLatexFile;
  
  private File targetHtmlFile_EP;
  
  private File targetHtmlFile_EL;
  
  private FileOutputStream latexStream;
  
  private FileOutputStream htmlStream_EP;
  
  private FileOutputStream htmlStream_EL;
  
  private String latexOutput;
  
  private String htmlOutput_EP;
  
  private String htmlOutput_EL;
  
  private String current_personname;
  
  private List<Integer> mealsKcals;
  
  private List<Integer> saladsKcals;
  
  private int usedKcalWeek = 0;
  
  private Map<Zutat, Integer> amoutOfIngredients;
  
  public Object M2T() {
    return null;
  }
  
  public static void main(final String[] args) {
    InputOutput.<String>println("Starte Generierung des Ernährungsplans.");
    final M2T m2t = new M2T();
    m2t.generate("src/de/tu_bs/cs/isf/mbse/Ernaehrungsplan/generator", "test");
    InputOutput.<String>println("Generierung beendet.");
  }
  
  public void generate(final String folder, final String file) {
    try {
      boolean _fileExists = this.fileExists(folder, file);
      boolean _not = (!_fileExists);
      if (_not) {
        InputOutput.<String>println(((("Datei nicht vorhanden " + folder) + "") + file));
        return;
      }
      EpElement _loadModel = this.loader.loadModel(folder, file);
      this.epElement = _loadModel;
      EList<Ernaehrungsplan> _eplanElement = this.epElement.getEplanElement();
      this.eplans = _eplanElement;
      for (final Ernaehrungsplan e : this.eplans) {
        {
          this.preparations(e);
          this.computeKcals();
          this.computeAmount();
          File _file = new File(".");
          final File currentDirectory = _file.getCanonicalFile();
          String _plus = (currentDirectory + File.separator);
          String _plus_1 = (_plus + "output");
          final File outputPath = new File(_plus_1);
          String _plus_2 = (outputPath + File.separator);
          String _plus_3 = (_plus_2 + this.current_personname);
          String _plus_4 = (_plus_3 + "_Latex.tex");
          File _file_1 = new File(_plus_4);
          this.targetLatexFile = _file_1;
          File _parentFile = this.targetLatexFile.getParentFile();
          _parentFile.mkdirs();
          this.targetLatexFile.createNewFile();
          FileOutputStream _fileOutputStream = new FileOutputStream(this.targetLatexFile);
          this.latexStream = _fileOutputStream;
          String _generateLatex = this.generateLatex(e);
          String _replaceAll = _generateLatex.replaceAll("\"", "");
          this.latexOutput = _replaceAll;
          byte[] _bytes = this.latexOutput.getBytes();
          this.latexStream.write(_bytes);
          this.latexStream.close();
          final File workingDirectory = outputPath;
          GeneratePDF.latex2PDF(this.targetLatexFile, outputPath, workingDirectory);
          File _file_2 = new File(((("output" + File.separator) + this.current_personname) + "_EP_HTML.html"));
          this.targetHtmlFile_EP = _file_2;
          this.targetHtmlFile_EP.createNewFile();
          FileOutputStream _fileOutputStream_1 = new FileOutputStream(this.targetHtmlFile_EP);
          this.htmlStream_EP = _fileOutputStream_1;
          String _generateHtmlSchedule = this.generateHtmlSchedule(e);
          this.htmlOutput_EP = _generateHtmlSchedule;
          byte[] _bytes_1 = this.htmlOutput_EP.getBytes();
          this.htmlStream_EP.write(_bytes_1);
          this.htmlStream_EP.close();
          File _file_3 = new File(((("output" + File.separator) + this.current_personname) + "_EL_HTML.html"));
          this.targetHtmlFile_EL = _file_3;
          this.targetHtmlFile_EL.createNewFile();
          FileOutputStream _fileOutputStream_2 = new FileOutputStream(this.targetHtmlFile_EL);
          this.htmlStream_EL = _fileOutputStream_2;
          String _generateHtmlShoppingList = this.generateHtmlShoppingList(e);
          this.htmlOutput_EL = _generateHtmlShoppingList;
          byte[] _bytes_2 = this.htmlOutput_EL.getBytes();
          this.htmlStream_EL.write(_bytes_2);
          this.htmlStream_EL.close();
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public void preparations(final Ernaehrungsplan e) {
    Person _personen = e.getPersonen();
    String _name = _personen.getName();
    this.current_personname = _name;
    ArrayList<Gericht> _arrayList = new ArrayList<Gericht>();
    this.salads = _arrayList;
    ArrayList<Gericht> _arrayList_1 = new ArrayList<Gericht>();
    this.meals = _arrayList_1;
    HashMap<Zutat, Integer> _hashMap = new HashMap<Zutat, Integer>();
    this.amoutOfIngredients = _hashMap;
    ArrayList<Integer> _arrayList_2 = new ArrayList<Integer>();
    this.saladsKcals = _arrayList_2;
    ArrayList<Integer> _arrayList_3 = new ArrayList<Integer>();
    this.mealsKcals = _arrayList_3;
    this.usedKcalWeek = 0;
    String[] mealnameArray = null;
    StringBuilder sb = null;
    EList<Gericht> _gerichte = e.getGerichte();
    for (final Gericht g : _gerichte) {
      {
        String _name_1 = g.getName();
        String[] _split = _name_1.split("_");
        mealnameArray = _split;
        StringBuilder _stringBuilder = new StringBuilder();
        sb = _stringBuilder;
        for (final String s : mealnameArray) {
          {
            sb.append(s);
            sb.append(" ");
          }
        }
        String _string = sb.toString();
        g.setName(_string);
        boolean _isIstSalat = g.isIstSalat();
        if (_isIstSalat) {
          this.salads.add(g);
        } else {
          this.meals.add(g);
        }
      }
    }
    int _length = ((Object[])Conversions.unwrapArray(this.salads, Object.class)).length;
    boolean _lessThan = (_length < 7);
    if (_lessThan) {
      for (int i = (((Object[])Conversions.unwrapArray(this.salads, Object.class)).length - 1); (i < 6); i++) {
        this.salads.add(null);
      }
    }
  }
  
  /**
   * Kalenderwoche berechnen
   */
  public int getWeekOfYear() {
    Calendar calendar = new GregorianCalendar();
    Date trialTime = new Date();
    calendar.setTime(trialTime);
    return calendar.get(Calendar.WEEK_OF_YEAR);
  }
  
  /**
   * Berechnung der Kalorienanzahl der jeweiligen Gerichte
   */
  public void computeKcals() {
    int kcal = 0;
    int i = 0;
    for (final Gericht g : this.meals) {
      {
        EList<Gericht2Zutat> _zutaten = g.getZutaten();
        for (final Gericht2Zutat z : _zutaten) {
          Zutat _zutat = z.getZutat();
          int _kcal = _zutat.getKcal();
          int _menge = z.getMenge();
          int _multiply = (_kcal * _menge);
          int _divide = (_multiply / 100);
          int _plus = (kcal + _divide);
          kcal = _plus;
        }
        if ((i <= 6)) {
          this.mealsKcals.add(Integer.valueOf(kcal));
          this.usedKcalWeek = (this.usedKcalWeek + kcal);
          i++;
        }
        kcal = 0;
      }
    }
    for (i = 0; (i < 7); i++) {
      Gericht _get = this.salads.get(i);
      boolean _notEquals = (!Objects.equal(_get, null));
      if (_notEquals) {
        Gericht _get_1 = this.salads.get(i);
        EList<Gericht2Zutat> _zutaten = _get_1.getZutaten();
        for (final Gericht2Zutat z : _zutaten) {
          Zutat _zutat = z.getZutat();
          int _kcal = _zutat.getKcal();
          int _menge = z.getMenge();
          int _multiply = (_kcal * _menge);
          int _divide = (_multiply / 100);
          int _plus = (kcal + _divide);
          kcal = _plus;
        }
        this.saladsKcals.add(Integer.valueOf(kcal));
        this.usedKcalWeek = (this.usedKcalWeek + kcal);
        kcal = 0;
      } else {
        this.saladsKcals.add(Integer.valueOf(kcal));
      }
    }
  }
  
  /**
   * Menge der benötigten Zutaten für die Einkaufsliste berechnen
   */
  public void computeAmount() {
    int amount = 0;
    for (final Gericht g : this.meals) {
      EList<Gericht2Zutat> _zutaten = g.getZutaten();
      for (final Gericht2Zutat g2z : _zutaten) {
        Zutat _zutat = g2z.getZutat();
        boolean _containsKey = this.amoutOfIngredients.containsKey(_zutat);
        boolean _not = (!_containsKey);
        if (_not) {
          Zutat _zutat_1 = g2z.getZutat();
          int _menge = g2z.getMenge();
          this.amoutOfIngredients.put(_zutat_1, Integer.valueOf(_menge));
        } else {
          Zutat _zutat_2 = g2z.getZutat();
          Integer _get = this.amoutOfIngredients.get(_zutat_2);
          int _menge_1 = g2z.getMenge();
          int _plus = ((_get).intValue() + _menge_1);
          amount = _plus;
          Zutat _zutat_3 = g2z.getZutat();
          this.amoutOfIngredients.replace(_zutat_3, Integer.valueOf(amount));
        }
      }
    }
    for (final Gericht s : this.salads) {
      boolean _notEquals = (!Objects.equal(s, null));
      if (_notEquals) {
        EList<Gericht2Zutat> _zutaten_1 = s.getZutaten();
        for (final Gericht2Zutat g2z_1 : _zutaten_1) {
          Zutat _zutat_4 = g2z_1.getZutat();
          boolean _containsKey_1 = this.amoutOfIngredients.containsKey(_zutat_4);
          boolean _not_1 = (!_containsKey_1);
          if (_not_1) {
            Zutat _zutat_5 = g2z_1.getZutat();
            int _menge_2 = g2z_1.getMenge();
            this.amoutOfIngredients.put(_zutat_5, Integer.valueOf(_menge_2));
          } else {
            Zutat _zutat_6 = g2z_1.getZutat();
            Integer _get_1 = this.amoutOfIngredients.get(_zutat_6);
            int _menge_3 = g2z_1.getMenge();
            int _plus_1 = ((_get_1).intValue() + _menge_3);
            amount = _plus_1;
            Zutat _zutat_7 = g2z_1.getZutat();
            this.amoutOfIngredients.replace(_zutat_7, Integer.valueOf(amount));
          }
        }
      }
    }
  }
  
  /**
   * "Startmethode" der Latex-Generierung
   * aktueller Ernährungsplan wird übergeben
   */
  public String generateLatex(final Ernaehrungsplan e) {
    StringConcatenation _builder = new StringConcatenation();
    String _generateLatexHead = this.generateLatexHead();
    _builder.append(_generateLatexHead, "");
    _builder.newLineIfNotEmpty();
    _builder.append("\\begin{document}");
    _builder.newLine();
    String _generateLatexSchedule = this.generateLatexSchedule(e);
    _builder.append(_generateLatexSchedule, "");
    _builder.newLineIfNotEmpty();
    _builder.append("\\newpage");
    _builder.newLine();
    String _generateLatexShoppingList = this.generateLatexShoppingList(e);
    _builder.append(_generateLatexShoppingList, "");
    _builder.newLineIfNotEmpty();
    _builder.append("\\end{document}");
    _builder.newLine();
    return _builder.toString();
  }
  
  /**
   * Latexkopf mit allen Einstellungen, Packages, ...
   */
  public String generateLatexHead() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\\documentclass[10pt, a4paper]{article}");
    _builder.newLine();
    _builder.append("\\usepackage[a4paper, bottom=2.0cm, top=2.0cm]{geometry}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\\usepackage[utf8]{inputenc}");
    _builder.newLine();
    _builder.append("\\usepackage[ngerman]{babel}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\\pagestyle{empty}");
    _builder.newLine();
    _builder.append("\\parindent0pt");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\\usepackage{tabularx}");
    _builder.newLine();
    _builder.append("\\usepackage{multirow}");
    _builder.newLine();
    _builder.append("\\newcolumntype{C}{>{\\centering\\arraybackslash}X}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\\usepackage{pdflscape}");
    _builder.newLine();
    _builder.append("\\usepackage{ragged2e}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\\usepackage{enumitem} ");
    _builder.newLine();
    _builder.append("\\setitemize{leftmargin=*}");
    _builder.newLine();
    _builder.newLine();
    return _builder.toString();
  }
  
  /**
   * Generiert den Ernährungsplan für Latex.
   */
  public String generateLatexSchedule(final Ernaehrungsplan e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.newLine();
    _builder.append("\\begin{landscape}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("{\\Large \\textbf{Ernährungsplan}} \\medskip \\\\");
    _builder.newLine();
    _builder.append("\t");
    _builder.append(this.current_personname, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("\\\\ Empfohlener Energiebedarf pro Woche: ");
    _builder.newLine();
    _builder.append("\t");
    Person _personen = e.getPersonen();
    int _kcal = _personen.getKcal();
    _builder.append(_kcal, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t ");
    _builder.append("Kalorien $\\rightarrow$ ");
    _builder.newLine();
    _builder.append("\t");
    Person _personen_1 = e.getPersonen();
    int _kcal_1 = _personen_1.getKcal();
    int _divide = (_kcal_1 / 7);
    _builder.append(_divide, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("Kalorien pro Tag \\medskip \\\\");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\\renewcommand*{\\arraystretch}{1.2}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\\begin{tabularx}{\\linewidth}{|X|X|X|X|X|X|X|}\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\\hline");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\\Centering \\multirow{2}{*}{\\textbf{Montag}} & \\Centering \\multirow{2}{*}{\\textbf{Dienstag}} & \\Centering \\multirow{2}{*}{\\textbf{Mittwoch}} & \\Centering \\multirow{2}{*}{\\textbf{Donnerstag}} & \\Centering \\multirow{2}{*}{\\textbf{Freitag}} & \\Centering \\multirow{2}{*}{\\textbf{Samstag}} & \\Centering \\multirow{2}{*}{\\textbf{Sonntag}} \\\\");
    _builder.newLine();
    _builder.append("%\t\t&  &  &  &  &  &  \\\\");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("&  &  &  &  &  &  \\\\");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\\hline");
    _builder.newLine();
    {
      ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, 7, true);
      for(final Integer j : _doubleDotLessThan) {
        _builder.append("\t\t");
        Gericht _get = this.meals.get((j).intValue());
        String _name = _get.getName();
        _builder.append(_name, "\t\t");
        _builder.append(" \\newline {\\scriptsize ");
        Integer _get_1 = this.mealsKcals.get((j).intValue());
        _builder.append(_get_1, "\t\t");
        _builder.append(" kcal}");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("\\begin{small}");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("\\begin{itemize}");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("\\itemsep0pt");
        _builder.newLine();
        {
          Gericht _get_2 = this.meals.get((j).intValue());
          EList<Gericht2Zutat> _zutaten = _get_2.getZutaten();
          for(final Gericht2Zutat g2z : _zutaten) {
            _builder.append("\t\t");
            _builder.append("\t\t");
            _builder.append("\\item ");
            int _menge = g2z.getMenge();
            _builder.append(_menge, "\t\t\t\t");
            _builder.append("g ");
            Zutat _zutat = g2z.getZutat();
            String _name_1 = _zutat.getName();
            _builder.append(_name_1, "\t\t\t\t");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("\\end{itemize}");
        _builder.newLine();
        _builder.append("\t\t");
        _builder.append("\\end{small}");
        _builder.newLine();
        {
          Gericht _get_3 = this.meals.get((j).intValue());
          String _kommentar = _get_3.getKommentar();
          int _length = _kommentar.length();
          boolean _greaterThan = (_length > 0);
          if (_greaterThan) {
            _builder.append("\t\t");
            _builder.append("\\begin{scriptsize}");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("\t");
            _builder.append("Anmerkung: ");
            Gericht _get_4 = this.meals.get((j).intValue());
            String _kommentar_1 = _get_4.getKommentar();
            _builder.append(_kommentar_1, "\t\t\t");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t");
            _builder.append("\\end{scriptsize}");
            _builder.newLine();
          }
        }
        {
          if (((j).intValue() < 6)) {
            _builder.append("\t\t");
            _builder.append("&");
            _builder.newLine();
          } else {
            _builder.append("\t\t");
            _builder.append("\\\\");
            _builder.newLine();
          }
        }
      }
    }
    _builder.append("\t\t");
    _builder.append("\\hline");
    _builder.newLine();
    {
      ExclusiveRange _doubleDotLessThan_1 = new ExclusiveRange(0, 7, true);
      for(final Integer j_1 : _doubleDotLessThan_1) {
        {
          Gericht _get_5 = this.salads.get((j_1).intValue());
          boolean _notEquals = (!Objects.equal(_get_5, null));
          if (_notEquals) {
            _builder.append("\t\t");
            Gericht _get_6 = this.salads.get((j_1).intValue());
            String _name_2 = _get_6.getName();
            _builder.append(_name_2, "\t\t");
            _builder.append(" \\newline {\\scriptsize ");
            Integer _get_7 = this.saladsKcals.get((j_1).intValue());
            _builder.append(_get_7, "\t\t");
            _builder.append(" kcal}");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t");
            _builder.append("\\begin{small}");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("\t");
            _builder.append("\\begin{itemize}");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("\t");
            _builder.append("\\itemsep0pt");
            _builder.newLine();
            {
              Gericht _get_8 = this.salads.get((j_1).intValue());
              EList<Gericht2Zutat> _zutaten_1 = _get_8.getZutaten();
              for(final Gericht2Zutat g2z_1 : _zutaten_1) {
                _builder.append("\t\t");
                _builder.append("\t\t");
                _builder.append("\\item ");
                int _menge_1 = g2z_1.getMenge();
                _builder.append(_menge_1, "\t\t\t\t");
                _builder.append("g ");
                Zutat _zutat_1 = g2z_1.getZutat();
                String _name_3 = _zutat_1.getName();
                _builder.append(_name_3, "\t\t\t\t");
                _builder.newLineIfNotEmpty();
              }
            }
            _builder.append("\t\t");
            _builder.append("\t");
            _builder.append("\\end{itemize}");
            _builder.newLine();
            _builder.append("\t\t");
            _builder.append("\\end{small}");
            _builder.newLine();
            {
              Gericht _get_9 = this.salads.get((j_1).intValue());
              String _kommentar_2 = _get_9.getKommentar();
              int _length_1 = _kommentar_2.length();
              boolean _greaterThan_1 = (_length_1 > 0);
              if (_greaterThan_1) {
                _builder.append("\t\t");
                _builder.append("\\begin{scriptsize}");
                _builder.newLine();
                _builder.append("\t\t");
                _builder.append("\t");
                _builder.append("Anmerkung: ");
                Gericht _get_10 = this.salads.get((j_1).intValue());
                String _kommentar_3 = _get_10.getKommentar();
                _builder.append(_kommentar_3, "\t\t\t");
                _builder.newLineIfNotEmpty();
                _builder.append("\t\t");
                _builder.append("\\end{scriptsize}");
                _builder.newLine();
              }
            }
          }
        }
        {
          if (((j_1).intValue() < 6)) {
            _builder.append("\t\t");
            _builder.append("&");
            _builder.newLine();
          } else {
            _builder.append("\t\t");
            _builder.append("\\\\");
            _builder.newLine();
          }
        }
      }
    }
    _builder.append("\t\t");
    _builder.append("\\hline");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("\\end{tabularx} \\medskip \\\\ ");
    _builder.newLine();
    _builder.append("Diese Woche wurden ");
    _builder.append(this.usedKcalWeek, "");
    _builder.append(" von ");
    _builder.newLineIfNotEmpty();
    Person _personen_2 = e.getPersonen();
    int _kcal_2 = _personen_2.getKcal();
    _builder.append(_kcal_2, "");
    _builder.newLineIfNotEmpty();
    _builder.append("Kalorien verbraucht. ");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\\end{landscape}");
    _builder.newLine();
    return _builder.toString();
  }
  
  /**
   * Generiert die Einkaufsliste für Latex.
   */
  public String generateLatexShoppingList(final Ernaehrungsplan e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("{\\Large \\textbf{Einkaufsliste}} \\medskip \\\\");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\\begin{itemize}");
    _builder.newLine();
    {
      Set<Zutat> _keySet = this.amoutOfIngredients.keySet();
      for(final Zutat key : _keySet) {
        _builder.append("\t");
        _builder.append("\\item ");
        Integer _get = this.amoutOfIngredients.get(key);
        _builder.append(_get, "\t");
        _builder.append("g ");
        String _name = key.getName();
        _builder.append(_name, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\\end{itemize}");
    _builder.newLine();
    return _builder.toString();
  }
  
  /**
   * Generiert den Ernährungsplan für HTML.
   */
  public String generateHtmlSchedule(final Ernaehrungsplan e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<!DOCTYPE html>");
    _builder.newLine();
    _builder.append("<html lang=\"en\">");
    _builder.newLine();
    _builder.append("<head>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<meta charset=\"utf-8\">");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<title>Ernährungsplan</title>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<!-- Bootstrap -->");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<link href=\"../html/css/bootstrap.min.css\" rel=\"stylesheet\">");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<link href=\"../html/css/style_EP.css\" rel=\"stylesheet\">");
    _builder.newLine();
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<!-- WARNING: Respond.js doesn\'t work if you view the page via file:// -->");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<!--[if lt IE 9]>");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("<script src=\"https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js\"></script>");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("<script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("<![endif]-->");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("</head>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<body>");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("<div class=\"container\">");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<div class=\"row\">");
    _builder.newLine();
    _builder.append("          ");
    _builder.append("<h1>Ernährungsplan</h1>");
    _builder.newLine();
    _builder.append("          ");
    _builder.append("<p>");
    _builder.append(this.current_personname, "          ");
    _builder.append("<br />Empfohlener Energiebedarf pro Woche:");
    _builder.newLineIfNotEmpty();
    _builder.append("\t \t\t");
    Person _personen = e.getPersonen();
    int _kcal = _personen.getKcal();
    _builder.append(_kcal, "\t \t\t");
    _builder.append(" Kalorien &rarr; ");
    Person _personen_1 = e.getPersonen();
    int _kcal_1 = _personen_1.getKcal();
    int _divide = (_kcal_1 / 7);
    _builder.append(_divide, "\t \t\t");
    _builder.append(" Kalorien pro Tag</p>");
    _builder.newLineIfNotEmpty();
    _builder.append("          ");
    _builder.append("<table class=\"table table-bordered\">");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("<thead>");
    _builder.newLine();
    _builder.append("              ");
    _builder.append("<tr>");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("<th>Montag</th>");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("<th>Dienstag</th>");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("<th>Mittwoch</th>");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("<th>Donnerstag</th>");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("<th>Freitag</th>");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("<th>Samstag</th>");
    _builder.newLine();
    _builder.append("                ");
    _builder.append("<th>Sonntag</th>");
    _builder.newLine();
    _builder.append("              ");
    _builder.append("</tr>");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("</thead>");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("<tbody>");
    _builder.newLine();
    _builder.append("              ");
    _builder.append("<tr>");
    _builder.newLine();
    {
      ExclusiveRange _doubleDotLessThan = new ExclusiveRange(0, 7, true);
      for(final Integer j : _doubleDotLessThan) {
        _builder.append("              ");
        _builder.append("<td>");
        Gericht _get = this.meals.get((j).intValue());
        String _name = _get.getName();
        _builder.append(_name, "              ");
        _builder.append(" <br /> <small>");
        Integer _get_1 = this.mealsKcals.get((j).intValue());
        _builder.append(_get_1, "              ");
        _builder.append(" kcal</small><br /> ");
        _builder.newLineIfNotEmpty();
        _builder.append("              ");
        _builder.append("  ");
        _builder.append("<ul>");
        _builder.newLine();
        {
          Gericht _get_2 = this.meals.get((j).intValue());
          EList<Gericht2Zutat> _zutaten = _get_2.getZutaten();
          for(final Gericht2Zutat g2z : _zutaten) {
            _builder.append("<li>");
            int _menge = g2z.getMenge();
            _builder.append(_menge, "");
            _builder.append("g ");
            Zutat _zutat = g2z.getZutat();
            String _name_1 = _zutat.getName();
            _builder.append(_name_1, "");
            _builder.append("</li>");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("              ");
        _builder.append("  ");
        _builder.append("</ul>");
        _builder.newLine();
        {
          Gericht _get_3 = this.meals.get((j).intValue());
          String _kommentar = _get_3.getKommentar();
          int _length = _kommentar.length();
          boolean _greaterThan = (_length > 0);
          if (_greaterThan) {
            _builder.append("<small>Anmerkung: ");
            Gericht _get_4 = this.meals.get((j).intValue());
            String _kommentar_1 = _get_4.getKommentar();
            _builder.append(_kommentar_1, "");
            _builder.append("</small>");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("              ");
        _builder.append("</td>");
        _builder.newLine();
      }
    }
    _builder.append("              ");
    _builder.append("</tr>");
    _builder.newLine();
    _builder.append("              ");
    _builder.append("<tr>");
    _builder.newLine();
    {
      ExclusiveRange _doubleDotLessThan_1 = new ExclusiveRange(0, 7, true);
      for(final Integer j_1 : _doubleDotLessThan_1) {
        {
          Gericht _get_5 = this.salads.get((j_1).intValue());
          boolean _notEquals = (!Objects.equal(_get_5, null));
          if (_notEquals) {
            _builder.append("<td>");
            Gericht _get_6 = this.salads.get((j_1).intValue());
            String _name_2 = _get_6.getName();
            _builder.append(_name_2, "");
            _builder.append("<br /> <small>");
            Integer _get_7 = this.saladsKcals.get((j_1).intValue());
            _builder.append(_get_7, "");
            _builder.append(" kcal</small><br /> ");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t\t\t\t\t\t");
            _builder.append("<ul>");
            _builder.newLine();
            {
              Gericht _get_8 = this.salads.get((j_1).intValue());
              EList<Gericht2Zutat> _zutaten_1 = _get_8.getZutaten();
              for(final Gericht2Zutat g2z_1 : _zutaten_1) {
                _builder.append("\t\t\t\t\t\t\t");
                _builder.append("<li>");
                int _menge_1 = g2z_1.getMenge();
                _builder.append(_menge_1, "\t\t\t\t\t\t\t");
                _builder.append("g ");
                Zutat _zutat_1 = g2z_1.getZutat();
                String _name_3 = _zutat_1.getName();
                _builder.append(_name_3, "\t\t\t\t\t\t\t");
                _builder.append("</li>");
                _builder.newLineIfNotEmpty();
              }
            }
            _builder.append("\t\t                    ");
            _builder.append("</ul>");
            _builder.newLine();
            {
              Gericht _get_9 = this.meals.get((j_1).intValue());
              String _kommentar_2 = _get_9.getKommentar();
              int _length_1 = _kommentar_2.length();
              boolean _greaterThan_1 = (_length_1 > 0);
              if (_greaterThan_1) {
                _builder.append("<small>Anmerkung: ");
                Gericht _get_10 = this.salads.get((j_1).intValue());
                String _kommentar_3 = _get_10.getKommentar();
                _builder.append(_kommentar_3, "");
                _builder.append("</small>");
                _builder.newLineIfNotEmpty();
              }
            }
            _builder.append("\t\t                  ");
            _builder.append("</td>");
            _builder.newLine();
          } else {
            _builder.append("<td></td>");
            _builder.newLine();
          }
        }
      }
    }
    _builder.append("              ");
    _builder.append("</tr>");
    _builder.newLine();
    _builder.append("            ");
    _builder.append("</tbody>");
    _builder.newLine();
    _builder.append("          ");
    _builder.append("</table>");
    _builder.newLine();
    _builder.append("          ");
    _builder.append("<p>Diese Woche wurden ");
    _builder.append(this.usedKcalWeek, "          ");
    _builder.append(" von ");
    Person _personen_2 = e.getPersonen();
    int _kcal_2 = _personen_2.getKcal();
    _builder.append(_kcal_2, "          ");
    _builder.append(" Kalorien verbraucht.</p>");
    _builder.newLineIfNotEmpty();
    _builder.append("        ");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("</div>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("      ");
    _builder.append("<!-- jQuery (necessary for Bootstrap\'s JavaScript plugins) -->");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js\"></script>");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("<!-- Include all compiled plugins (below), or include individual files as needed -->");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("<script src=\"../html/js/bootstrap.min.js\"></script>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("</body>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("</html>");
    _builder.newLine();
    return _builder.toString();
  }
  
  /**
   * Generiert die Einkaufsliste für HTML.
   */
  public String generateHtmlShoppingList(final Ernaehrungsplan e) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<!DOCTYPE html>");
    _builder.newLine();
    _builder.append("<html lang=\"en\">");
    _builder.newLine();
    _builder.append("<head>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<meta charset=\"utf-8\">");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<title>Einkaufsliste</title>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<!-- Bootstrap -->");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<link href=\"../html/css/bootstrap.min.css\" rel=\"stylesheet\">");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<link href=\"../html/css/style_EL.css\" rel=\"stylesheet\">");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<!-- WARNING: Respond.js doesn\'t work if you view the page via file:// -->");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<!--[if lt IE 9]>");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("<script src=\"https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js\"></script>");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("<script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("<![endif]-->");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("</head>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("  ");
    _builder.append("<body>");
    _builder.newLine();
    _builder.append("  \t");
    _builder.append("<div class=\"container\">");
    _builder.newLine();
    _builder.append("  \t\t");
    _builder.append("<div class=\"row\">");
    _builder.newLine();
    _builder.append("  \t\t\t");
    _builder.append("<h1>Einkaufsliste</h1>");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("<ul>");
    _builder.newLine();
    {
      Set<Zutat> _keySet = this.amoutOfIngredients.keySet();
      for(final Zutat key : _keySet) {
        _builder.append("<li> ");
        Integer _get = this.amoutOfIngredients.get(key);
        _builder.append(_get, "");
        _builder.append("g ");
        String _name = key.getName();
        _builder.append(_name, "");
        _builder.append(" </li>");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("        ");
    _builder.append("</ul>");
    _builder.newLine();
    _builder.append("  \t\t");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("  \t");
    _builder.append("</div>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("  \t");
    _builder.append("<!-- jQuery (necessary for Bootstrap\'s JavaScript plugins) -->");
    _builder.newLine();
    _builder.append("  \t");
    _builder.append("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js\"></script>");
    _builder.newLine();
    _builder.append("  \t");
    _builder.append("<!-- Include all compiled plugins (below), or include individual files as needed -->");
    _builder.newLine();
    _builder.append("  \t");
    _builder.append("<script src=\"../html/js/bootstrap.min.js\"></script>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("</body>");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("</html>");
    _builder.newLine();
    return _builder.toString();
  }
  
  /**
   * Prüft, ob die Datei existiert
   */
  public boolean fileExists(final String folder, final String file) {
    final StringBuffer path = new StringBuffer();
    path.append(folder);
    int _length = folder.length();
    int _minus = (_length - 1);
    char _charAt = folder.charAt(_minus);
    boolean _notEquals = (!Objects.equal(Character.valueOf(_charAt), "/"));
    if (_notEquals) {
      path.append("/");
    }
    path.append(file);
    path.append(".ep");
    String _string = path.toString();
    final File f = new File(_string);
    boolean _and = false;
    boolean _exists = f.exists();
    if (!_exists) {
      _and = false;
    } else {
      boolean _isDirectory = f.isDirectory();
      boolean _not = (!_isDirectory);
      _and = _not;
    }
    if (_and) {
      return true;
    }
    return false;
  }
}
