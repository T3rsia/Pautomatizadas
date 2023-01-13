package pasos;

import io.cucumber.java.Before;
import utilidades.SetUp;

public class AntesPasos {
	@Before
	public void lasaro() {
		SetUp.inicio();
	}

}
