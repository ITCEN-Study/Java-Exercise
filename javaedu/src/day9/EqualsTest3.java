package day9;
import java.util.Date;
import java.util.Objects;
class Value {
	int value;
	Value(int value) {
		this.value = value;  
	}
//	@Override
//	public boolean equals(Object obj) {
//		boolean result = false;
//		if (obj != null && obj instanceof Value)
//			if (value == ((Value)obj).value)
//				result = true;
//		return result; 
//	}
	@Override
	public int hashCode() {
		return Objects.hash(value);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Value other = (Value) obj;
		return value == other.value;
	}
	
}

public class EqualsTest3 {
	public static void main(String[] args) {
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		Value v3 = new Value(20);
		System.out.println(v1.hashCode());
		System.out.println(v2.hashCode());
		System.out.println(v3.hashCode());
		
		System.out.println(v1.equals(null)); 				// v1 == null
		System.out.println(v1.equals(v3)); 				// v1 == v3
		System.out.println(v1.equals(v2)); 
		System.out.println(v1.equals(new Date())); 

		if (v1.equals(v2))
			System.out.println("v1과 v2는 같습니다.");
		else
			System.out.println("v1과 v2는 다릅니다.");
		v2 = v1;
		if (v1.equals(v2))
			System.out.println("v1과 v2는 같습니다.");
		else
			System.out.println("v1과 v2는 다릅니다.");
	}
}
