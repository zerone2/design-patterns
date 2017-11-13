import java.util.ArrayList;
import java.util.List;

public class CameraRunner {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Camera> cameras = new ArrayList<Camera>();
		 
		cameras.add(new StandardCamera(1.3));
		cameras.add(new StandardCamera(1.6));
		cameras.add(new MotorisedCamera(2.0));
		// new camera
		// code for adding new camera in here
		XYZCamera xyzCamera = new XYZCamera(2.2);
		cameras.add(new XYZCameraAdapter(xyzCamera));

		for (Camera camera : cameras) {
		    System.out.println(camera);
		}
	}

}
