package br.net.hartwig.dmhsisfinanceiro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import br.net.hartwig.dmhsisfinanceiro.config.properties.DmhSisFinanceiroApiProperties;

@SpringBootApplication
@EnableConfigurationProperties(DmhSisFinanceiroApiProperties.class)
public class DmhSisFinanceiroApplication {

	public static void main(String[] args) {
		SpringApplication.run(DmhSisFinanceiroApplication.class, args);
	}

}
