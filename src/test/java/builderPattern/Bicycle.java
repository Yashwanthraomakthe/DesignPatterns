package builderPattern;

public class Bicycle {
	private final boolean gears;
	private final boolean doubleStands;
	private final boolean doubleSeats;
	private final boolean carrier;

	private Bicycle(Builder builder) {
		this.gears = builder.gears;
		this.doubleStands = builder.doubleStands;
		this.doubleSeats = builder.doubleSeats;
		this.carrier = builder.carrier;
	}

	 @Override
	    public String toString() {
	        return "Bicycle [gears=" + gears + ", doubleStands=" + doubleStands + 
	                ", doubleSeats=" + doubleSeats + ", carrier=" + carrier + "]";
	    }
	public static class Builder {
		private boolean gears;
		private boolean doubleStands;
		private boolean doubleSeats;
		private boolean carrier;

		public Builder() {
			// Default values can be set here if needed
		}

		public Builder setGears(boolean gears) {
			this.gears = gears;
			return this;
		}

		public Builder setDoubleStands(boolean doubleStands) {
			this.doubleStands = doubleStands;
			return this;
		}

		public Builder setDoubleSeats(boolean doubleSeats) {
			this.doubleSeats = doubleSeats;
			return this;
		}

		public Builder setCarrier(boolean carrier) {
			this.carrier = carrier;
			return this;
		}

		public Bicycle build() {
			return new Bicycle(this);
		}
	}
}
