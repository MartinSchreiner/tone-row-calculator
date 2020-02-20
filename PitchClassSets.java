import java.util.ArrayList;
import javax.swing.*;
import java.util.*;

public class PitchClassSets{
	
	public static void main(String[] args){
		String[] menuoptions = {"Normal Order", "Check Transpose", "Transpose", "Check Inversion", "Inversion", "Prime Order", "Interval Class Vector"};
		while(1+1==2){
		String useroption = (String) JOptionPane.showInputDialog(null, "Choose an option", "Main Menu", JOptionPane.QUESTION_MESSAGE, null, menuoptions, menuoptions[0]);
		if(useroption == null)
			System.exit(0);
		switch(useroption.charAt(6)){
			case ' ':
			String set = JOptionPane.showInputDialog(null, "Input the pitch set delineated by commas");
			String s = "";
			ArrayList<Integer> pitches = new ArrayList<Integer>();
			for(int i = 0; i<set.length(); i++){
				if(set.charAt(i) == ','){
					pitches.add(Integer.parseInt(s));
					s = "";
				}else{
					s += set.charAt(i); 
				}

			}
			if(s.length()!=0){
				pitches.add(Integer.parseInt(s));
			}
			PitchSet chord = new PitchSet(pitches);
			JOptionPane.showMessageDialog(null, "Your chord is: " + chord + "\nIn normal order it is: " + chord.normalOrder());
			break;

			case 'T':
			set = JOptionPane.showInputDialog(null, "Input the first pitch set delineated by commas");
			s = "";
			pitches = new ArrayList<Integer>();
			for(int i = 0; i<set.length(); i++){
				if(set.charAt(i) == ','){
					pitches.add(Integer.parseInt(s));
					s = "";
				}else{
					s += set.charAt(i); 
				}

			}
			if(s.length()!=0){
				pitches.add(Integer.parseInt(s));
			}
			PitchSet chord1 = new PitchSet(pitches);
			set = JOptionPane.showInputDialog(null, "Input the second pitch set delineated by commas");
			s = "";
			pitches = new ArrayList<Integer>();
			for(int i = 0; i<set.length(); i++){
				if(set.charAt(i) == ','){
					pitches.add(Integer.parseInt(s));
					s = "";
				}else{
					s += set.charAt(i); 
				}

			}
			if(s.length()!=0){
				pitches.add(Integer.parseInt(s));
			}
			PitchSet chord2 = new PitchSet(pitches);
			int trans = chord2.isTranspose(chord1);
			if(trans == -1){
				JOptionPane.showMessageDialog(null, chord2 + " is not a transposition of " + chord1 +".");
			}else{
				JOptionPane.showMessageDialog(null, chord2 + " is " + chord1 + " transposed by an interval of " + trans + ".");
			}
			break;

			case 'o':
			set = JOptionPane.showInputDialog(null, "Input the pitch set delineated by commas");
			s = "";
			pitches = new ArrayList<Integer>();
			for(int i = 0; i<set.length(); i++){
				if(set.charAt(i) == ','){
					pitches.add(Integer.parseInt(s));
					s = "";
				}else{
					s += set.charAt(i); 
				}

			}
			if(s.length()!=0){
				pitches.add(Integer.parseInt(s));
			}
			chord = new PitchSet(pitches);
			trans = Integer.parseInt(JOptionPane.showInputDialog(null, "Transpose by an interval of:"));
			JOptionPane.showMessageDialog(null, chord + " in normal order is " + chord.normalOrder() + ".\n" + chord.normalOrder() +" transposed by an interval of " + trans + " is " + chord.transpose(trans) + ".");
			break;

			case 'I':
			set = JOptionPane.showInputDialog(null, "Input the first pitch set delineated by commas");
			s = "";
			pitches = new ArrayList<Integer>();
			for(int i = 0; i<set.length(); i++){
				if(set.charAt(i) == ','){
					pitches.add(Integer.parseInt(s));
					s = "";
				}else{
					s += set.charAt(i); 
				}

			}
			if(s.length()!=0){
				pitches.add(Integer.parseInt(s));
			}
			chord1 = new PitchSet(pitches);
			set = JOptionPane.showInputDialog(null, "Input the second pitch set delineated by commas");
			s = "";
			pitches = new ArrayList<Integer>();
			for(int i = 0; i<set.length(); i++){
				if(set.charAt(i) == ','){
					pitches.add(Integer.parseInt(s));
					s = "";
				}else{
					s += set.charAt(i); 
				}

			}
			if(s.length()!=0){
				pitches.add(Integer.parseInt(s));
			}
			chord2 = new PitchSet(pitches);
			int inv = chord2.isInvTranspose(chord1);
			if(inv == -1){
				JOptionPane.showMessageDialog(null, chord2 + " is not a transposition of " + chord1 +".");
			}else{
				JOptionPane.showMessageDialog(null, chord2 + " is " + chord1 + " transposed by T" + inv + "I.");
			}
			break;

			case 'i':
			set = JOptionPane.showInputDialog(null, "Input the pitch set delineated by commas");
			s = "";
			pitches = new ArrayList<Integer>();
			for(int i = 0; i<set.length(); i++){
				if(set.charAt(i) == ','){
					pitches.add(Integer.parseInt(s));
					s = "";
				}else{
					s += set.charAt(i); 
				}

			}
			if(s.length()!=0){
				pitches.add(Integer.parseInt(s));
			}
			chord = new PitchSet(pitches);
			trans = Integer.parseInt(JOptionPane.showInputDialog(null, "Transpose by an inversion number:"));
			JOptionPane.showMessageDialog(null, chord + " in normal order is " + chord.normalOrder() + ".\n" + chord.normalOrder() +" transposed by T" + trans + "I is " + chord.invert(trans) + ".");
			break;

			case 'O':
			set = JOptionPane.showInputDialog(null, "Input the pitch set delineated by commas");
			s = "";
			pitches = new ArrayList<Integer>();
			for(int i = 0; i<set.length(); i++){
				if(set.charAt(i) == ','){
					pitches.add(Integer.parseInt(s));
					s = "";
				}else{
					s += set.charAt(i); 
				}

			}
			if(s.length()!=0){
				pitches.add(Integer.parseInt(s));
			}
			chord = new PitchSet(pitches);
			JOptionPane.showMessageDialog(null, chord + " in normal order is " + chord.normalOrder() + ".\nThe prime order is " + chord.primeForm() + ".");
			break;

			case 'a':
			set = JOptionPane.showInputDialog(null, "Input the pitch set delineated by commas");
			s = "";
			pitches = new ArrayList<Integer>();
			for(int i = 0; i<set.length(); i++){
				if(set.charAt(i) == ','){
					pitches.add(Integer.parseInt(s));
					s = "";
				}else{
					s += set.charAt(i); 
				}

			}
			if(s.length()!=0){
				pitches.add(Integer.parseInt(s));
			}
			chord = new PitchSet(pitches);
			int[] icv = chord.intervalClassVector();
			String result = "[";
			for(int i = 0; i < icv.length-1; i++){
				result += icv[i] +",";
			}
			result += icv[icv.length-1] + "]";
			JOptionPane.showMessageDialog(null, chord + " in prime order is " + chord.primeForm() + ".\n The interval class vector is " + result + ".");
			break;


		}
	}
	}
}

class PitchSet{
	private ArrayList<Integer> pitches;
	public PitchSet(int size){
		pitches = new ArrayList<Integer>(size);
	}

	public PitchSet(ArrayList<Integer> pitches){
		this.pitches = pitches;
	}

	public String toString(){
		String s = "{";
		for(int i=0; i<pitches.size()-1; i++){
			s += pitches.get(i) +", ";
		}

		s += pitches.get(pitches.size()-1)+"}";
		return s;
	}
	public int[] getPitches(){
		int[] result = new int[pitches.size()];
		for(int i=0; i<pitches.size(); i++)
			result[i] = pitches.get(i);
		return result;
	}

	public boolean equals(PitchSet other){
		int[] p1 = this.normalOrder().getPitches();
		int[] p2 = other.normalOrder().getPitches();
		if(p1.length != p2.length)
			return false;
		for(int i=0; i < p1.length; i++){
			if(p1[i] != p2[i])
				return false;
		}
		return true;
	}

	public int isTranspose(PitchSet start){
		int[] p1 = this.normalOrder().getPitches();
		int[] p2 = start.normalOrder().getPitches();
		if(p1.length != p2.length){
			return -1;
		}
		int interval = Math.abs(p1[0]-p2[0]);
		for(int i=1; i<p1.length; i++){
			if(p1[i]-p2[i] != interval)
				return -1;
		}
		return interval;
	}

	public int isInvTranspose(PitchSet start){
		int[] p1 = this.normalOrder().getPitches();
		int[] p2 = start.normalOrder().getPitches();
		if(p1.length != p2.length)
			return -1;
		int number = (p1[p1.length-1] + p2[0])%12;
		for(int i = 1; i < p2.length; i++){
			if((p1[p1.length-1-i] + p2[i])%12 != number)
				return -1;
		}
		return number;
	}
	public PitchSet normalOrder(){
		ArrayList<Integer> temp = new ArrayList<Integer>();
		for(int i=0; i < pitches.size(); i++){
			temp.add(pitches.get(i));
		}
		ArrayList<Integer> order = new ArrayList<Integer>();
		int tempsize = temp.size();
		for(int i = 0; i < tempsize; i++){
			order.add(temp.remove(findMin(temp)));
		}
		int start = findMaxInterval(order);
		for(int i = 0; i < start; i++){
			order.add(order.remove(0));
		}
		return new PitchSet(order);
	}

	public PitchSet primeForm(){
		int[] p = normalOrder().getPitches();
		int[] p1 = normalOrder().transpose(12-p[0]).getPitches();
		//System.out.println(normalOrder().transpose(12-p[0]));
		p = normalOrder().invert(0).normalOrder().getPitches();
		int[] p2 = normalOrder().invert(0).normalOrder().transpose(12-p[0]).getPitches();
		//System.out.println(normalOrder().invert(0).normalOrder().transpose(12-p[0]));
		int n = p1.length-2;
		boolean tied = true;
		int i = 0;
		while(tied){
			if(p1[n]-p1[0] > p2[n]-p2[0]){
				i=2;
				tied=false;
			}else if(p2[n]-p2[0] > p1[n]-p1[0]){
				i = 1;
				tied = false;
			}else if(n == 0){
				i = 1;
				tied = false;
			}else{
				n--;
			}	
		}
		if(i == 1){
			p = normalOrder().getPitches();
			return normalOrder().transpose(12-p[0]);
		}else{
			p = normalOrder().invert(0).normalOrder().getPitches();
			return normalOrder().invert(0).normalOrder().transpose(12-p[0]);
		}
	}
	public PitchSet invert(int n){
		int[] p1 = normalOrder().getPitches();
		ArrayList<Integer> newpitches = new ArrayList<Integer>();
		for(int i=1; i <= p1.length; i++){
			if(p1[p1.length - i] > n){
				newpitches.add(12 + n - p1[p1.length - i]);
			}else{
				newpitches.add(n-p1[p1.length - i]);
			}
		}
		return new PitchSet(newpitches);
	}

	public PitchSet transpose(int interval){
		int[] pitches = normalOrder().getPitches();
		ArrayList<Integer> temp = new ArrayList<Integer>();
		for(int i = 0; i < pitches.length; i++){
			temp.add((pitches[i]+interval)%12);
		}
		return new PitchSet(temp);
	}

	public int[] intervalClassVector(){
		int[] classes = new int[6];
		ArrayList<Integer> diff = new ArrayList<Integer>();
		int[] p = primeForm().getPitches();
		for(int i = 0; i < p.length-1; i++){
			for(int j=i+1; j < p.length; j++){
				diff.add(p[j]-p[i]);
			}
		}
		for(int i = 0; i < diff.size(); i++){
			int test = diff.get(i);
			if(test > 6)
				test = 12-test;
			classes[test - 1]++;
		}
		return classes;
	}

	public int findMin(ArrayList<Integer> input){
		int min = 0;
		for(int i = 0; i < input.size(); i++){
			if(input.get(i)<input.get(min)){
				min = i;
			}
		}
		return min;
	}

	public int intervalBetween(int a, int b){
		if(a > b)
			return b+12-a;
		else
			return b-a;
		
	}

	public int findMaxInterval(ArrayList<Integer> input){
		int max = 0;
		int maxint = 0;
		ArrayList<Integer> maxlocations = new ArrayList<Integer>();

		for(int i = 0; i<input.size()-1;i++){
			if((input.get(i+1)-input.get(i))==maxint){
				max = i+1;
				maxlocations.add(max);
			}else if((input.get(i+1)-input.get(i))> maxint){
				maxint = input.get(i+1)-input.get(i);
				max = i+1;
				maxlocations.clear();
				maxlocations.add(max);
			}
		}
		if((input.get(0) + 12 - input.get(input.size()-1)>maxint)){
			max = 0;
			maxlocations.clear();
			maxlocations.add(max);
		}
		if((input.get(0) + 12 - input.get(input.size()-1)==maxint)){
			maxlocations.add(0);
		}
		if(maxlocations.size() > 1){
			ArrayList<Integer> ntlints = new ArrayList<Integer>();
			for(int i = 0; i < maxlocations.size(); i++){
				ArrayList<Integer> temp = clone(input);
				for(int j = 0; j < maxlocations.get(i);j++){
					temp.add(temp.remove(0));
				}
				ntlints.add(intervalBetween(temp.get(0), temp.get(temp.size()-2)));
			}

			int maxindex = findMin(ntlints);
			max = maxlocations.get(maxindex); 
		}
		return max;
	}

	public ArrayList<Integer> clone(ArrayList<Integer> list){
		ArrayList<Integer> result = new ArrayList<Integer>();
		for(int i = 0; i < list.size(); i++){
			result.add(list.get(i));
		}
		return result;
	}
}