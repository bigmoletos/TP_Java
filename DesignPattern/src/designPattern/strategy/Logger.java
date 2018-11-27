/**
 * 
 */
package designPattern.strategy;

import java.io.StreamTokenizer;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author franck Desmedt
 *
 */
public class Logger {

	private static Logger instance = null;

	// singleton
	public static Logger getinstance() {
		if (instance == null) {
			instance = new Logger();
		}
		return instance;
	}

	private ILoggerStrategy strategy;

	public ILoggerStrategy getStrategy() {
		return strategy;
	}

	// permet de modifier la stratégie
	public void setStrategy(ILoggerStrategy strategy) {
		this.strategy = strategy;
	}

	// constructuer par defaut
	private Logger() {

	}

	public void Log(Object o) {
		//
		String s = String.format("date [%s]-**information**: %s", LocalDateTime.now().toString(), o.toString());
		// logger je ne sais où je dois logger
		strategy.performLog(s);
	}

	public void LogError(Object o) {
		// construire la chaine de log.
		String s = String.format("date [%s] - **Error**: %s", LocalDateTime.now().toString(), o.toString());
		// logger (je sais pas oÃ¹ je dois logger)
		strategy.performLog(s);
	}

}
