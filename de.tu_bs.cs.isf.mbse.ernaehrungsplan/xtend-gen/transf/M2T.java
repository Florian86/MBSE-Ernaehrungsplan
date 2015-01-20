package transf;

import java.io.File;
import java.io.FileOutputStream;
import java.util.List;
import org.eclipse.xtend2.lib.StringConcatenation;
import transf.ModelLoader;

@SuppressWarnings("all")
public class M2T {
  public Object M2T() {
    return null;
  }
  
  private ModelLoader loader = new ModelLoader();
  
  private /* List<Person> */Object persons;
  
  private /* //Für jede Person soll der Plan erstellt werden.
  	Ernaehrungsplan */Object plan;
  
  private File targetLatexFile;
  
  private File targetHtmlFile;
  
  private FileOutputStream latexStream;
  
  private FileOutputStream htmlStream;
  
  private String latexOutput;
  
  private String htmlOutput;
  
  public void generate(final String folder, final String file) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method loadModel is undefined for the type M2T"
      + "\npersonen cannot be resolved"
      + "\ngetName cannot be resolved"
      + "\ntoLowerCase cannot be resolved"
      + "\ngetName cannot be resolved"
      + "\ntoLowerCase cannot be resolved");
  }
  
  /**
   * "Startmethode" der Latex-Generierung
   */
  public String generateLatex(final /* Person */Object p) {
    StringConcatenation _builder = new StringConcatenation();
    String _generateLatexHead = this.generateLatexHead();
    _builder.append(_generateLatexHead, "");
    _builder.newLineIfNotEmpty();
    _builder.append("\\begin(document)");
    _builder.newLine();
    String _generateLatexSchedule = this.generateLatexSchedule();
    _builder.append(_generateLatexSchedule, "");
    _builder.newLineIfNotEmpty();
    _builder.append("\\newpage");
    _builder.newLine();
    String _generateLatexShoppingList = this.generateLatexShoppingList();
    _builder.append(_generateLatexShoppingList, "");
    _builder.newLineIfNotEmpty();
    _builder.append("\\end(document)");
    _builder.newLine();
    return _builder.toString();
  }
  
  public String generateLatexHead() {
    return null;
  }
  
  /**
   * Generiert den Ernährungsplan für Latex.
   */
  public String generateLatexSchedule() {
    return null;
  }
  
  /**
   * Generiert die Einkaufsliste für Latex.
   */
  public String generateLatexShoppingList() {
    return null;
  }
  
  /**
   * "Startmethode" der HTML-Generierung
   */
  public String generateHtml(final /* Person */Object p) {
    String _xblockexpression = null;
    {
      this.generateHtmlSchedule();
      _xblockexpression = this.generateHtmlShoppingList();
    }
    return _xblockexpression;
  }
  
  /**
   * Generiert den Ernährungsplan für HTML.
   */
  public String generateHtmlSchedule() {
    return null;
  }
  
  /**
   * Generiert die Einkaufsliste für HTML.
   */
  public String generateHtmlShoppingList() {
    return null;
  }
}
