enum Box{A, B, C, D}

class EnumSwitchDemo{
	public static void main(String[] args){
		Box a = Box.A;
		Box b = Box.B;
		switch(b){
			case A: System.out.println(a);
			break;
			case B: System.out.println(b);
			break;
			default:
			break;
		}
	}
}