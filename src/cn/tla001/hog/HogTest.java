package cn.tla001.hog;

import static com.googlecode.javacv.cpp.opencv_core.cvCreateImage;
import static com.googlecode.javacv.cpp.opencv_core.cvGetSize;
import static com.googlecode.javacv.cpp.opencv_core.cvReleaseImage;
import static com.googlecode.javacv.cpp.opencv_highgui.cvDestroyWindow;
import static com.googlecode.javacv.cpp.opencv_highgui.cvLoadImage;
import static com.googlecode.javacv.cpp.opencv_highgui.cvNamedWindow;
import static com.googlecode.javacv.cpp.opencv_highgui.cvShowImage;
import static com.googlecode.javacv.cpp.opencv_highgui.cvWaitKey;

import com.googlecode.javacv.cpp.opencv_core.IplImage;

public class HogTest {
	public static void main(String[] args) {
		// System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
		// Mat mat = Mat.eye(3, 3, CvType.CV_8UC1);
		// System.out.println("mat = " + mat.dump());
		// Mat src =new Mat();
		// src= Highgui.imread("test.jpg");
		IplImage srcImg = cvLoadImage("./resources/face.jpg");
		IplImage gamaImg = cvCreateImage(cvGetSize(srcImg), 8, 3);

		cvNamedWindow("src");
		cvShowImage("src", srcImg);
		cvWaitKey(0);
		cvReleaseImage(srcImg);
		cvDestroyWindow("src");
	}
}
