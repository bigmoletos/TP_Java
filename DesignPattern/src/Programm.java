
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayList;
import java.util.Date;

import designPattern.factory.LoggerStrategyFactory;
import designPattern.factory.strategyType;
import designPattern.iterator.DemoIterator;
import designPattern.singleton.MonSingleton;

import designPattern.strategy.ConsoleLogStrategy;
import designPattern.strategy.FichierLogStrategy;
import designPattern.strategy.Logger;
import designPattern.strategy.*;


public class Programm {

	public static void main(String[] args) throws InvalidAlgorithmParameterException {
		// appel du singleton
		MonSingleton.getInstance().faituntruc();

		ArrayList<Date> lesDates = new ArrayList<>();
		lesDates.add(new Date());
		lesDates.add(new Date(18, 06, 07));

		DemoIterator.Iterate(new Date[0], lesDates);

		// pattern design strategy

		// avec la stratégie de sortier console
		Logger.getinstance().setStrategy(new ConsoleLogStrategy());
		
		// création fichier log dans logError
		ILoggerStrategy s=LoggerStrategyFactory.createStrategy(strategyType.Console);
		Logger.getinstance().LogError("coucou !");
		// avec la stratégie de sortie fichier
		Logger.getinstance().setStrategy(new FichierLogStrategy("C:\\Users\\HB\\fichier.log"));
		//Logger.getinstance().setStrategy(new FichierLogStrategy(s);

				// création fichier log dans log
		//comme ecrit en dernier remplace le LogError("coucou !");
		Logger.getinstance().Log("les vandales attaquent la reine");
		
		//design factory
		ILoggerStrategy s2=LoggerStrategyFactory.createStrategy(strategyType.File);
		Logger.getinstance().setStrategy(s2);
		
		//Logger.getinstance().setStrategy(s);
		// création fichier log dans log
		//comme ecrit en dernier remplace le LogError("coucou !");
		Logger.getinstance().Log("le roi s'en va en guerre");
		//Logger.getinstance().setStrategy(s2);
	}
}
