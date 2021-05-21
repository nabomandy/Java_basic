package ch10;
enum Direction { EAST, SOUTH, WEST, NORTH }

class EnumEx1 {
	public static void main(String[] args) {
		Direction d1 = Direction.EAST;
		Direction d2 = Direction.valueOf("WEST");
		Direction d3 = Enum.valueOf(Direction.class, "EAST");
		
		System.out.println("d1="+d1);
		System.out.println("d2="+d2);
		System.out.println("d3="+d3);
		System.out.println("d1==d2 ? "+ (d1==d2));
		System.out.println("d1==d3 ? "+ (d1==d3));
		System.out.println("d1.equals(d3) ? "+ (d1.compareTo(d3)));
		System.out.println("d1.equals(d2) ? "+ (d1.compareTo(d2)));
		System.out.println("================");
		switch(d1) {
		case EAST: //Direction.EAST라고 쓸 수 없다.
			System.out.println("The direction is EAST"); 	break;
		case SOUTH: //Direction.EAST라고 쓸 수 없다.
			System.out.println("The direction is SOUTH"); 	break;
		case WEST: //Direction.EAST라고 쓸 수 없다.
			System.out.println("The direction is WEST"); 	break;
		case NORTH: //Direction.EAST라고 쓸 수 없다.
			System.out.println("The direction is NORTH"); 	break;
		default:
			System.out.println("Invalid direction.");      break; 
			}
	Direction[] dArr = Direction.values();
	for(Direction d : dArr) //for(Direction d : Direction.values())
		System.out.printf("%s=%d%n", d.name(), d.ordinal());

	}

}
