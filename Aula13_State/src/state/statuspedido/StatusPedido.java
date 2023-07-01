package state.statuspedido;

public enum StatusPedido {
	INICIAL{
		public StatusPedido avancar() {
			return PAGO;
		}
		public StatusPedido cancelar() {
			return CANCELADO;
		}
	}, PAGO, CANCELADO
}
