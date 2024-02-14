package testNG;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider {
@Test(dataProvider = "data")
public void datacollect(String s) {
	System.out.println(s);
}

@Test(dataProvider = "data2")
public void datacollect2(String[]j) {
	System.out.println(j[0]+">>"+j[1]);
}

@DataProvider()
public Iterator<String> data() {
	List<String> a= new ArrayList<>();
	a.add("yogesh");
	a.add("adding data");
	return a.iterator();
}

@DataProvider()
public Iterator<String[]> data2() {
	Set<String[]> b= new HashSet<>();
	b.add(new String[]{"yogesh","222"});
	b.add(new String[]{"yo yo","258"});
	return b.iterator();
}

}
