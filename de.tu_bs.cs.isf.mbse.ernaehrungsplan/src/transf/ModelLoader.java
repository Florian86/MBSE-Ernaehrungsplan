package transf;

import java.io.File;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import ep.EpElement;
import ep.resource.ep.mopp.EpResourceFactory;

/*
 * siehe Vogella 3.2
 * (http://www.vogella.com/tutorials/EclipseEMFPersistence/article.html#javacode_save)
 */
public class ModelLoader {
    public EpElement loadModel(String folder, String fileName) {
        Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ep", new EpResourceFactory());//TODO: EMFText missing

        ResourceSet rs = new ResourceSetImpl();
        File orig = new File(folder + File.separator + fileName + ".ep");
        URI uri = URI.createFileURI(orig.getAbsolutePath());
        Resource resource = rs.getResource(uri, true);
        EpElement model = (EpElement) resource.getContents().get(0);
        return model;
    }
}
