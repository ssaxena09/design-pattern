package creationaldesignpattern.builderpatter;

import creationaldesignpattern.builderpatter.Item;
import creationaldesignpattern.builderpatter.nonveg.chicken.ChickeRara;
import creationaldesignpattern.builderpatter.nonveg.chicken.ChickenTandori;
import creationaldesignpattern.builderpatter.nonveg.mutton.AndhraMuttonFry;
import creationaldesignpattern.builderpatter.nonveg.mutton.MuttonMasala;
import creationaldesignpattern.builderpatter.roti.Naan;
import creationaldesignpattern.builderpatter.roti.TavaRoti;
import creationaldesignpattern.builderpatter.veg.chaap.MalaiChaap;
import creationaldesignpattern.builderpatter.veg.chaap.SoyaChaap;
import creationaldesignpattern.builderpatter.veg.paneer.BPM;
import creationaldesignpattern.builderpatter.veg.paneer.KadaiPaneer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MealBuilder {
	private List<Item> orderedItems = new ArrayList<>();
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public void orderItems() throws IOException {

		System.out.println("===================================");
		System.out.println("Welcome to the Dhaba");
		System.out.println("===================================");
		System.out.println("type number to select the meal type");
		System.out.println("===================================");
		System.out.println("1. VegMeal");
		System.out.println("2. NonVegMeal");

		int selectedOption = Integer.parseInt(br.readLine());

		switch (selectedOption) {
		case 1:
			System.out.println("===================================");
			System.out.println("you have selected non veg meal");
			System.out.println("===================================");
			System.out.println("select the non veg type");
			System.out.println("===================================");
			System.out.println("1. chicken");
			System.out.println("2. mutton");

			int selectedNonVegOption = Integer.parseInt(br.readLine());

			switch (selectedNonVegOption) {
			case 1:
				selectChickenMeal(br);
				break;
			case 2:
				selectMuttonMeal(br);
				break;

			}
			break;

		case 2:
			System.out.println("===================================");
			System.out.println("you have selected  veg meal");
			System.out.println("===================================");
			System.out.println("select the non veg type");
			System.out.println("===================================");
			System.out.println("1. paneer");
			System.out.println("2. chaap");

			int selectedVegOption = Integer.parseInt(br.readLine());

			switch (selectedVegOption) {
			case 1:
				selectPannerOption(br);
				break;
			case 2:
				selectChaapOption(br);
				break;

			}
			break;

		}
		selectRoti(br);

		showBill();

	}

	private void showBill() {
		System.out.println("\t \t\t\t\tBILL\t\t\t\t \t");
		orderedItems.forEach(item -> {
			System.out.println("\t" + item.name() + "\t\t\t\t\t\t" + item.price());
		});
		System.out.println("===========================================");
		System.out.println("Total \t\t\t\t\t\t\t" + orderedItems.stream()
				.collect(Collectors.summingInt(item -> (int) item.price())));
	}

	private void selectRoti(BufferedReader br) throws IOException {
		System.out.println("===================================");
		System.out.println("selectType  Roti");
		System.out.println("===================================");
		System.out.println("1. Naan");
		System.out.println("2. TavaRoti");

		int selectedRotiType = Integer.parseInt(br.readLine());

		switch (selectedRotiType) {
		case 1:
			orderedItems.add(new Naan());
			break;

		case 2:
			orderedItems.add(new TavaRoti());
			break;
		default:
			System.out.println("type correct number");
			selectRoti(br);
		}
	}

	private void selectChaapOption(BufferedReader br) throws IOException {
		System.out.println("===================================");
		System.out.println("you have selected CHaap meal");
		System.out.println("===================================");
		System.out.println("select chaap ");
		System.out.println("1. Malai chaap");
		System.out.println("2. soya chaap");
		int selectChaap = Integer.parseInt(br.readLine());

		switch (selectChaap) {
		case 1:
			orderedItems.add(new MalaiChaap());
			break;

		case 2:
			orderedItems.add(new SoyaChaap());
			break;
		default:
			System.out.println("type correct number");
			selectChaapOption(br);
		}
	}

	private void selectPannerOption(BufferedReader br) throws IOException {

		System.out.println("===================================");
		System.out.println("you have selected Paneer meal");
		System.out.println("===================================");
		System.out.println("select paneer curry");
		System.out.println("1. BPM");
		System.out.println("2. Kadai Panner");
		int selectPaneer = Integer.parseInt(br.readLine());

		switch (selectPaneer) {
		case 1:
			orderedItems.add(new BPM());
			break;

		case 2:
			orderedItems.add(new KadaiPaneer());
			break;
		default:
			System.out.println("type correct number");
			selectPannerOption(br);
		}

	}

	private void selectMuttonMeal(BufferedReader br) throws IOException {
		System.out.println("===================================");
		System.out.println("you have selected mutton meal");
		System.out.println("===================================");
		System.out.println("select mutton curry");
		System.out.println("1. Andhra mutton fry");
		System.out.println("2. Mutton Masala");
		int selectMutton = Integer.parseInt(br.readLine());

		switch (selectMutton) {
		case 1:
			orderedItems.add(new AndhraMuttonFry());
			break;

		case 2:
			orderedItems.add(new MuttonMasala());
			break;
		default:
			System.out.println("type correct number");
			selectMuttonMeal(br);
		}
	}

	private void selectChickenMeal(BufferedReader br) throws IOException {
		System.out.println("===================================");
		System.out.println("you have selected chicken meal");
		System.out.println("===================================");
		System.out.println("select chicken curry");
		System.out.println("1. chickenTandori");
		System.out.println("2. chickern Rara");
		int selectedChicken = Integer.parseInt(br.readLine());

		switch (selectedChicken) {
		case 1:
			orderedItems.add(new ChickenTandori());
			break;

		case 2:
			orderedItems.add(new ChickeRara());
			break;
		default:
			System.out.println("type correct number");
			selectChickenMeal(br);
		}
	}
}
