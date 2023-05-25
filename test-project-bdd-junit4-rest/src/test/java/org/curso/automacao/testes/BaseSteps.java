package org.curso.automacao.testes;

import org.curso.automacao.testes.helpers.ConnectionHelper;
import org.curso.automacao.testes.helpers.PropertiesHelper;
import org.curso.automacao.testes.integrados.bdd.Runner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.qameta.allure.Step;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Builder
public class BaseSteps {

	private static final Logger logger = LoggerFactory.getLogger(BaseSteps.class);

	protected static String getUrl(String service) throws Exception {
		
		return ConnectionHelper.getHost(Runner.environment.get(), service);
	}
	
	public static void logDebug(String message, String ... args) {
		logDebug(String.format(message, (Object[])args));
	}
	
	public static void logDebug(Exception e, String message, String ... args) {
		logDebug(e, String.format(message, (Object[])args));
	}
	
	public static void logWarn(String message, String ... args) {
		logWarn(String.format(message, (Object[])args));
	}
	
	public static void logWarn(Exception e, String message, String ... args) {
		logWarn(e, String.format(message, (Object[])args));
	}
	
	public static void logInfo(String message, String ... args) {
		logInfo(String.format(message, (Object[])args));
	}
	
	public static void logInfo(Exception e, String message, String ... args) {
		logInfo(e, String.format(message, (Object[])args));
	}
	
	public static void logError(String message, String ... args) {
		logError(String.format(message, (Object[])args));
	}
	
	public static void logError(Exception e, String message, String ... args) {
		logError(e, String.format(message, (Object[])args));
	}
	
	@Step("{0}")
	public  static void logDebug(String message) {
		logger.debug(message);
	}
	
	@Step("{0}")
	public static void logDebug(String message, Exception e) {
		logger.debug(message, e);
	}
	
	@Step("{0}")
	public  static void logWarn(String message) {
		logger.warn(message);
	}
	
	@Step("{0}")
	public static void logWarn(String message, Exception e) {
		logger.warn(message, e);
	}
	
	@Step("{0}")
	public  static void logInfo(String message) {
		logger.info(message);
	}
	
	@Step("{0}")
	public static void logInfo(String message, Exception e) {
		logger.info(message, e);
	}
	
	@Step("{0}")
	public static void logError(String message) {
		logger.error(message);
	}
	
	@Step("{0}")
	public static void logError(String message, Exception e) {
		logger.error(message, e);
	}

}
