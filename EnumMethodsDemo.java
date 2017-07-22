enum Box{ A, B, C, D}
class EnumMethodsDemo{
	public static void main(String[] args){
		Box[] boxes = Box.values();
		for(Box box: boxes){
			System.out.println(box+"..."+box.ordinal());
		}
	}
}