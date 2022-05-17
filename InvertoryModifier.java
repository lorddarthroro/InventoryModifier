import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class InvertoryModifier {
	public static void main(String[] args) throws FileNotFoundException {
		File original = new File("C:/Users/ahmad/Desktop/InventoryModify.csv");
		Scanner scnr = new Scanner(original);
		ArrayList<String> classification = new ArrayList<String>();
		ArrayList<String> name = new ArrayList<String>();
		while(scnr.hasNextLine()) {
			String str = scnr.nextLine();
			//System.out.println(str);
			String[] s = str.split(",");
			name.add(s[3]);
			classification.add(s[8]);
			System.out.println(str);
		}
		System.out.println(name.get(654));
		System.out.println(classification.get(654));
//		int y = 0;
//		for(String s: classification) {
//			if(s.equals("None")) {
//				y++;
//			}
//		}
//		System.out.println(y);
		int i = 0;
		for(String s1: name) {
			String s = s1.toLowerCase();
			if(s.contains("powerflex") || s.contains("sleek")|| s.contains("balloon") || s.contains("vaccess") || s.contains("dorado") || s.contains("conquest") || s.contains("atlas") || s.contains("dynamics") || s.contains("maxi") || s.contains("chameleon") || s.contains("first choice") || s.contains("ultraverse") || s.contains("lutonix") || s.contains("saber")) {
				//System.out.println(classification.get(i));
				if(classification.get(i).equals("None") || classification.get(i).equals("")) {
					classification.set(i, "Balloon");
					System.out.println("replacement done");
					//System.out.println(classification.get(i));
				}
			}
			
			else if(s.contains("smart") || s.contains("stent")||s.contains("bionimics") || s.contains("xlence") || s.contains("lifestream") || s.contains("valeo") || s.contains("lifestent") || s.contains("fluency") || s.contains("covera") || s.contains("elumin") || s.contains("lifestar") || s.contains("intact")) {
				//System.out.println(classification.get(i));
				if(classification.get(i).equals("None")||classification.get(i).equals("")) {
					classification.set(i, "Stents");
					System.out.println("replacement done");
				}
			}
			else if(s.contains("berenstein") || s.contains("cath")||s.contains("kumpe") || s.contains("rim") || s.contains("sos soft") || s.contains("glidecath") || s.contains("uf tempo") || s.contains("vista") || s.contains("pigtail") || s.contains("tempo") || s.contains("vert ") || s.contains("mpa")|| s.contains("vista") || s.contains("pigtail") || s.contains("adroit") || s.contains("quick cross") || s.contains("navicross") || s.contains("suntrax") || s.contains("rubicon")) {
				//System.out.println(classification.get(i));
				if(classification.get(i).equals("None")||classification.get(i).equals("")) {
					classification.set(i, "Catheters");
					System.out.println("replacement done");
				}
			}
			else if(s.contains("stabilizer") || s.contains("wire") || s.contains("command") || s.contains("amplatz") || s.contains("bentson") || s.contains("glidewire") || s.contains("astato") || s.contains("gladius mongo") || s.contains("grandslam") || s.contains("grand slam") || s.contains("fielder") || s.contains("regalia")|| s.contains("v-14") || s.contains("v14") || s.contains("v-18") || s.contains("v18") || s.contains("v 18") || s.contains("sv5") || s.contains("spartacare") || s.contains("thruway")) {
				//System.out.println(classification.get(i));
				if(classification.get(i).equals("None")||classification.get(i).equals("")) {
					classification.set(i, "Wires");
					System.out.println("replacement done");
				}
			}
			else if(s.contains("turbo elite") || s.contains("rotorex") || s.contains("phoenix")) {
				//System.out.println(classification.get(i));
				if(classification.get(i).equals("None")||classification.get(i).equals("")) {
					classification.set(i, "Atherectomy");
					System.out.println("replacement done");
				}
			}
			else if(s.contains("pinnacle") || s.contains("halo one") || s.contains("guidesheath") || s.contains("brite tip") || s.contains("destination") || s.contains("flexor check") || s.contains("fortress") || s.contains("sheath")) {
				//System.out.println(classification.get(i));
				if(classification.get(i).equals("None")||classification.get(i).equals("")) {
					classification.set(i, "Sheath");
					System.out.println("replacement done");
				}
			}
			else if(s.contains("celt") || s.contains("starclose") || s.contains("star close") || s.contains("perclose") || s.contains("per close") || s.contains("minx") || s.contains("angio-seal") || s.contains("angio seal")) {
				//System.out.println(classification.get(i));
				if(classification.get(i).equals("None")||classification.get(i).equals("")) {
					classification.set(i, "Closure Device");
					System.out.println("replacement done");
				}
			}
			i++;
			
		}
		int x = 0;
		for(String s: classification) {
			if(s.equals("None")) {
				//System.out.println(name.get(x));
				
			}
			x++;
		}
		System.out.println(classification.size());
		try (PrintWriter writer = new PrintWriter("Classifications.csv")) {

		      StringBuilder sb = new StringBuilder();
		      for(int j = 0; j < classification.size(); j++) {
		    	  sb.append(name.get(j));
		    	  sb.append(',');
		    	  sb.append(classification.get(j));
		    	  sb.append('\n');
		    	  System.out.println(j);
		      }
		      


		      writer.write(sb.toString());

		      System.out.println("done!");

		    } catch (FileNotFoundException e) {
		      System.out.println(e.getMessage());
		    }
//		System.out.println(x);
//		System.out.println(classification);
			
	}
}
