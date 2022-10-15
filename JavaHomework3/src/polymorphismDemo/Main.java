package polymorphismDemo;

public class Main {

	public static void main(String[] args) {
		
		BaseLogger[] loggers = new BaseLogger[] {new FileLogger(),new DatebaseLogger(),new EmailLogger()};
		for(BaseLogger logger : loggers) {
			logger.Log("Log messaji");
		}
	}

}
