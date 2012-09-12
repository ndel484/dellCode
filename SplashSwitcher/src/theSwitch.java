import java.io.*;
import java.util.*;

public class theSwitch {
	String absolutePath = "C:\\Windows\\System32\\oobe\\Info\\backgrounds\\";
	String tooBigFolder =  "C:\\Windows\\System32\\oobe\\Info\\tooBigFolder\\";

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

	public int checkForDefault() {
		File[] fileList = refreshFileList();
		for (int i = 0; i < fileList.length; i++) {
			if (fileList[i].getName().equals("backgroundDefault.jpg"))
				return i;
		}
		return -1;
	}

	public void renameFromBackgroundDefault(int currentDefaultIndex,
			String newName) {
		File[] fileList = refreshFileList();
		fileList[currentDefaultIndex]
				.renameTo(new File(absolutePath + newName));
	}

	public void renameAllByIndex(int exceptLast) {
		File[] fileList = refreshFileList();
		for (int i = 0; i < fileList.length - exceptLast; i++) {
			fileList[i].renameTo(new File(absolutePath + i + ".jpg"));
		}
	}

	public void renameToBackgroundDefault(int indexToRename) {
		File[] fileList = refreshFileList();
		fileList[indexToRename].renameTo(new File(absolutePath
				+ "backgroundDefault.jpg"));
	}

	public void checkFileSizes() {
		File[] fileList = refreshFileList();
		for (int i = 0; i < fileList.length; i++) {
			if(fileList[i].length()>=250880){
				fileList[i].renameTo(new File(tooBigFolder+i+".jpg"));
			}
		}
	}

}
