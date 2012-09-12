import java.io.File;
import java.util.Arrays;
import java.util.Comparator;

// class requires WindowsExplorerStringComparator
// pass in path of file list you would like, returns ordered by name, like windows.
public class windowsFileList {
	String absolutePath = "";

	public windowsFileList(String absolutePath) {
		this.absolutePath = absolutePath;
	}

	public File[] refreshFileList() {
		Comparator<String> explorerOrder = new WindowsExplorerStringComparator();
		File[] fileList = new File(absolutePath).listFiles();

		String[] fileNames = new String[fileList.length];

		File[] fileList2 = new File[fileList.length];

		for (int i = 0; i < fileList.length; i++) {
			fileNames[i] = fileList[i].getName();
		}
		Arrays.sort(fileNames, explorerOrder);

		for (int e = 0; e < fileList.length; e++) {
			for (int i = 0; i < fileList.length; i++) {
				if (fileNames[e].equals(fileList[i].getName())) {
					fileList2[e] = fileList[i];
				}
			}
		}

		return fileList2;
	}
}