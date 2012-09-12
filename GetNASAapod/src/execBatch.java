import java.io.File;
import java.util.Arrays;
import java.util.Comparator;

public class execBatch {
	String absolutePath = "C:\\Users\\k4k3\\Pictures\\wgot";

	File[] fileList = new windowsFileList(absolutePath).refreshFileList();

	public void grabFiles() {
		try {
			Runtime.getRuntime()
					.exec("cmd /c start C:\\Users\\k4k3\\Documents\\WindowsHax\\batchScriptz\\wgetStaticAPOD.bat");
		} catch (Exception e) {
		}

	}

	public void removeSmallerImage() {
		long lengthToKill = Math.min(fileList[1].length(), fileList[2].length());
		for (int i = 0; i < fileList.length; i++) {
			if (fileList[i].length() == lengthToKill) {
				System.out.println("killing "+fileList[i].getName());
				fileList[i].delete();
			}

		}

	}
}
