package cn.tla001.javacvtest;

import static com.googlecode.javacv.cpp.opencv_core.cvReleaseImage;
import static com.googlecode.javacv.cpp.opencv_highgui.cvDestroyWindow;
import static com.googlecode.javacv.cpp.opencv_highgui.cvLoadImage;
import static com.googlecode.javacv.cpp.opencv_highgui.cvNamedWindow;
import static com.googlecode.javacv.cpp.opencv_highgui.cvShowImage;
import static com.googlecode.javacv.cpp.opencv_highgui.cvWaitKey;

import com.googlecode.javacv.cpp.opencv_core.IplImage;

public class Demo1 {
	public static void main(String[] args) {
		IplImage srcImg = cvLoadImage("D:\\lena.jpg");
		cvNamedWindow("Test");
		cvShowImage("Test", srcImg);
		cvWaitKey(0);
		cvReleaseImage(srcImg);
		cvDestroyWindow("Text");

	}
}
