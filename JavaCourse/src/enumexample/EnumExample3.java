package enumexample;

public class EnumExample3 {

	public static void main(String[] args) {

		double apply = Operation.PLUS.apply(100, 200);
		System.out.println(apply);
		
		
		double apply2 = Operation.TIMES.apply(100, 200);
		System.out.println(apply2);
	}

}
 enum Operation {
    PLUS("+") {
        @Override
        public double apply(double x, double y) {
            return x + y;
        }
    },
    MINUS("-") {
        @Override
        public double apply(double x, double y) {
            return x - y;
        }
    },
    TIMES("*") {
        @Override
        public double apply(double x, double y) {
            return x * y;
        }
    },
    DIVIDE("/") {
        @Override
        public double apply(double x, double y) {
            return x / y;
        }
    };

    private final String symbol;

    Operation(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return symbol;
    }

    public abstract double apply(double x, double y);
}
 
 
 enum Operation2 {
	 
	 PLUS("+") {
		@Override
		public int eval(int x, int y) {
			
			return x+y;
		}
	};
	 
	 String symbol;//instance variable
	 
	 Operation2(String symbol){
		 this.symbol = symbol;
	 }
	 
	 public abstract int eval(int x, int y);
	 
	 
 }

