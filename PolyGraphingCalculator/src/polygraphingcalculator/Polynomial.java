
package polygraphingcalculator;

import java.util.ArrayList;
import java.util.List;


public class Polynomial {
    List<Term> terms = new ArrayList();
    
    public Polynomial(List<Term> t){
        this.terms = t;
    }
    
    public Polynomial(String s){
        double expo
        for(int i = 0; i < s.length(); i ++){
            
        }
    }
    public void printPolynomial(){
        System.out.println("");
        for(Term t: this.terms){
            System.out.print(t.toString()+" ");
        }
    }
    
    public void sortByDegree(){
        this.terms = MergeSort.mergeSort(terms);
    }
}
