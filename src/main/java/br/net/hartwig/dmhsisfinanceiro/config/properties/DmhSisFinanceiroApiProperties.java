package br.net.hartwig.dmhsisfinanceiro.config.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("dmhsisfinanceiroapiproperties")
public class DmhSisFinanceiroApiProperties {
	
	private String originCorsPermitida = "http://localhost:8000";

	private final ConfigSeguranca configSeguranca = new ConfigSeguranca();

	public ConfigSeguranca getConfigSeguranca() {
		return configSeguranca;
	}

	public String getOriginCorsPermitida() {
		return originCorsPermitida;
	}

	public void setOriginCorsPermitida(String originCorsPermitida) {
		this.originCorsPermitida = originCorsPermitida;
	}

	public static class ConfigSeguranca {

		private boolean enableHttps;

		public boolean isEnableHttps() {
			return enableHttps;
		}

		public void setEnableHttps(boolean enableHttps) {
			this.enableHttps = enableHttps;
		}

	}

}
