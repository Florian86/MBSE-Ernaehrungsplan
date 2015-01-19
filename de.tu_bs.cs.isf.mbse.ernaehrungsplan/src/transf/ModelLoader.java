package transf;

import java.io.File;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import de.tu_bs.cs.isf.mbse.ernaehrungsplan.metamodel.Ernaehrungsplan;

/*
 * siehe Vogella 3.2
 * (http://www.vogella.com/tutorials/EclipseEMFPersistence/article.html#javacode_save)
 */
public class ModelLoader {
    public Ernaehrungsplan loadModel(String folder, String fileName) {
        //Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ep", new CvResourceFactory());//TODO: EMFText missing

        ResourceSet rs = new ResourceSetImpl();
        File orig = new File(folder + File.separator + fileName + ".ep");
        URI uri = URI.createFileURI(orig.getAbsolutePath());
        Resource resource = rs.getResource(uri, true);
        Ernaehrungsplan model = (Ernaehrungsplan) resource.getContents().get(0);
        return model;
    }
}
