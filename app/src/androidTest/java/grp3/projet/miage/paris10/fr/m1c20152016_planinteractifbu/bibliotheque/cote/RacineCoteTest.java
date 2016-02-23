package grp3.projet.miage.paris10.fr.m1c20152016_planinteractifbu.bibliotheque.cote;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class RacineCoteTest {
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testNullArgumentOnInstantiation() throws Exception {
        RacineCote r = new RacineCote(null);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testEmptyStringArgumentOnInstantiation() throws Exception {
        RacineCote r = new RacineCote("");
    }

    @DataProvider(name = "testMatchesData")
    public Object[][] testMatchesData() {
        return new Object[][]{
                {"102", null, false},
                {"102", "", false},

                {"102", "1", true},
                {"102", "2", false},

                {"102", "10", true},
                {"102", "12", false},

                {"102", "102", true},
                {"102", "103", false},

                {"102", "1021", true}
        };
    }

    @Test(dataProvider = "testMatchesData")
    public void testMatches(String racine, String recherche, boolean expected) throws Exception {
        RacineCote r = new RacineCote(racine);
        assertEquals(r.matches(recherche), expected);
    }

    @DataProvider(name = "testCompareToData")
    public Object[][] testCompareToData() {
        return new Object[][]{
                {"102", "102", 0},
                {"102", "101", 1},
                {"102", "103", -1},
                {"102", "1021", -1},
                {"102", "10", 1}
        };
    }

    @Test(dataProvider = "testCompareToData")
    public void testCompareTo(String racine1, String racine2, int expected) throws Exception {
        RacineCote r1 = new RacineCote(racine1),
                r2 = new RacineCote(racine2);

        assertEquals(r1.compareTo(r2), expected);
    }
}