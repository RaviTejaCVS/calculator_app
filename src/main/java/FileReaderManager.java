import calculator.TestComponents.configReader;

public class FileReaderManager {
	private static FileReaderManager fileReaderManager = new FileReaderManager();
	private static configReader configFileReader;

	private FileReaderManager() {
	}

	 public static FileReaderManager getInstance( ) {
	      return fileReaderManager;
	 }

	 public configReader getConfigReader() {
		 return (configFileReader == null) ? new configReader() : configFileReader;
	 }
}
