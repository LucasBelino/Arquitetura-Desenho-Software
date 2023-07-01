package Builder;

public class CarroBuilderFluenteTest {
	Carro carroPronto = new CarroBuilderFluente()
			.buildPorta(portas)
			.buildMotor(motorVTEC)
			.buildeComputadorBordo(computadorBordoSiemens)
			.buildFreioABS(freioBosh)
			.getCarro();
	
	assertNotNull( carroPronto );
	assertNotNull( carroPronto.getMotor() );
	assertNotNull( carroPronto.getPorta() );
	assertTrue( carroPronto.getPorta().lenght == 2 );
	assertNotNull( carroPronto.getComputadorBordo() );
	assertNotNull( carroPronto.getFreioABS() );
}
