package uchidb;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.*;
/**
 * @author aelmore
 */
public class HW0Runner implements Containers<Integer, String> {
    private Map<String, Integer> cMap;

    public Set<Integer> initSet(Integer[] tArray) {
        Set<Integer> toSet = new HashSet<Integer>(Arrays.asList(tArray));
        return toSet;
    }

    public List<Integer> initList(Integer[] tArray) {
        List<Integer> toList = Arrays.asList(tArray);
        return toList;
    }
       
    public Map<String, Integer> initEmptyMap() {
        Map<String,Integer> newMap = new HashMap<String,Integer>();
        return newMap;
    }

    public void storeMap(Map<String,Integer> mapToStoreInClass) {
        this.cMap = mapToStoreInClass;
    }

    public boolean addToMap(String key, Integer value, boolean overwriteExistingKey) {
        if (this.cMap == null) {
            return false;
        }

        Integer val = this.cMap.get(key);
        if (val == null) {
            this.cMap.put(key, value);
            return true;
        } else {
            if (overwriteExistingKey == true) {
                this.cMap.put(key, value);
                return true;
            } else {
                return false;
            }
        }
    }

    public Integer getValueFromMap(String key) {
        if (this.cMap == null) {
            System.err.println("There is no local map stored!");
            return null;
        }

        return this.cMap.get(key);

    }

    public Integer getValueFromMap(String key, Integer defaultValue) {
        if (this.cMap == null) {
            return defaultValue;
        }

        return this.cMap.get(key);
    }

    private HW0Runner() {}
	//TODO you likely will need to add member variable
	private static Containers<Integer,String> containers = new HW0Runner();	

	// This class is a factory for a singleton containers class.
	// https://www.tutorialspoint.com/java/java_using_singleton.htm
	
	public static Containers<Integer, String> getContainers() {
        return containers;
	}

	
	public static void main(String[] args){
        return;
	} 
}


