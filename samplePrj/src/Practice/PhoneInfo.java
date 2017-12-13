package Practice;

public class PhoneInfo implements Comparable<PhoneInfo>{
	private String name;
	private String num;
	public PhoneInfo() {
		super();
	}
	public PhoneInfo(String name, String num) {
		super();
		this.name = name;
		this.num = num;
	}
	@Override
	public String toString() {
		return "PhoneInfo [name=" + name + ", num=" + num + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((num == null) ? 0 : num.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PhoneInfo other = (PhoneInfo) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (num == null) {
			if (other.num != null)
				return false;
		} else if (!num.equals(other.num))
			return false;
		return true;
	}
	
	
	@Override
	public int compareTo(PhoneInfo o) {

		return (this.name).compareTo(o.name);
	}
}
