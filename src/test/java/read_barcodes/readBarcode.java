package read_barcodes;

import java.io.File;
import java.net.URL;
import org.testng.Assert;
import com.asprise.ocr.Ocr;

public class readBarcode {

	public static void main(String[] args) {
		File file = new File(System.getProperty("user.dir")+"\\files\\barcode1.png");
//		File file = new File(System.getProperty("user.dir")+"\\files\\barcode2.png");
		Ocr.setUp();
		try {
		Ocr ocr = new Ocr();
		ocr.startEngine("eng", Ocr.SPEED_FAST);
		URL barcodeUrl = file.toURI().toURL();
		String output = ocr.recognize(new URL[] {barcodeUrl},ocr.RECOGNIZE_TYPE_BARCODE, ocr.OUTPUT_FORMAT_PLAINTEXT);
		ocr.stopEngine();
		System.out.println(output);
		Assert.assertTrue(output.contains("123456"));
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
