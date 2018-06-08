/**
 * 
 */
package designPattern.factory;

import java.io.File;

import designPattern.strategy.ConsoleLogStrategy;
import designPattern.strategy.FichierLogStrategy;
import designPattern.strategy.ILoggerStrategy;

/**
 * @author franck Desmedt
 *
 */
public class LoggerStrategyFactory {
	//constructeur pour interdire d'instancier la classe
	//conceptuellement la plupart des classes de factory sont des classes statiques
	private LoggerStrategyFactory() {
		}
	//autres méthodes
public static ILoggerStrategy createStrategy(strategyType s) {
	if (s==strategyType.Console) {
		return new ConsoleLogStrategy();
	} else if (s==strategyType.File) {
		try {
			String filename=File.createTempFile("demoPattern", ".log").getCanonicalPath();//crée un fichier temporaire dans le repertoire utilisant 
		//les fichiers tmp par defaut avec comme début du nom "demoPattern" et ".log" à la fin
			return new FichierLogStrategy(filename);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}return null;
}
}
