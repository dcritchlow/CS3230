import java.util.Comparator;


public class CompareInt implements Comparator<Person>
{
	@Override
	public int compare(Person p1, Person p2)
	{
		Integer firstId = p1.getId();
		Integer secondId = p2.getId();
		
		return firstId.compareTo(secondId);
	}
}
