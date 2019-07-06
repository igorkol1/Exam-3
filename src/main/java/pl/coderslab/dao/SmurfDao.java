package pl.coderslab.dao;

import pl.coderslab.domain.Smurf;

import java.util.ArrayList;
import java.util.List;

public class SmurfDao {

    List<Smurf> smurfList = new ArrayList<>();

    public List<Smurf> getList() {
        smurfList.add(new Smurf("Test 1 Name", "Test 1 Attribute", "Test 1 Desc."));
        smurfList.add(new Smurf("Test 2 Name", "Test 2 Attribute", "Test 2 Desc."));
        smurfList.add(new Smurf("Test 3 Name", "Test 3 Attribute", "Test 3 Desc."));
        smurfList.add(new Smurf("Test 4 Name", "Test 4 Attribute", "Test 4 Desc."));
        smurfList.add(new Smurf("Test 5 Name", "Test 5 Attribute", "Test 5 Desc."));
        return smurfList;
    }
}
