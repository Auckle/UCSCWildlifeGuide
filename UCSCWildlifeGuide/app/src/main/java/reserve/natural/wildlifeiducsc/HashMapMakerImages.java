// ************ Do not modify code that is not enclosed by asterisks ************* 
// ************ templates will be provided, writing in all caps is what needs to be filled in *********
// ************ the code in this file controls the images that are inserted into the animal summary profiles **********

package reserve.natural.wildlifeiducsc;

import java.util.HashMap;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.view.WindowManager;


public class HashMapMakerImages {

	//Fields
	HashMap<String, Integer> fullImageHashmapxh = new HashMap<String, Integer>();
	HashMap<String, Integer> portraitImageHashmapxh = new HashMap<String, Integer>();
	HashMap<String, Integer> landscapeImageHashmapxh = new HashMap<String, Integer>();
	
	// Creates a hashmap of animal names to their large image drawables
	public HashMapMakerImages(){

	// first add jpg image to all four drawable folders in the res folder, images equal to or less than 800 px work best
	// template for adding a new image: 
	// fullImageHashmapxh.put("NAME OF ANIMAL AS IT APPEARS ON BUTTON EXACTLY", R.drawable.NAME OF IMAGE FILE NO FILE TYPE);
	// to change an animal image just alter the file name portion mentioned above to the name of the new
	// jpg image
		
		//FullImages
		//Mammal Images
		fullImageHashmapxh.put("Mule Deer", R.drawable.deer);
		fullImageHashmapxh.put("Bobcat", R.drawable.bobcat);
		fullImageHashmapxh.put("Mountain Lion", R.drawable.mountain_lion);
		fullImageHashmapxh.put("Coyote", R.drawable.coyote);
		fullImageHashmapxh.put("California Pocket Mouse", R.drawable.calpocketmouse);
		fullImageHashmapxh.put("Dusky-footed Woodrat", R.drawable.woodrat);
		fullImageHashmapxh.put("California Mouse", R.drawable.californiamouse);
		fullImageHashmapxh.put("Botta's Pocket Gopher", R.drawable.bottagopher);
		fullImageHashmapxh.put("California Ground Squirrel", R.drawable.groundsquirrel);
		fullImageHashmapxh.put("Ornate Shrew", R.drawable.ornateshrew);
		fullImageHashmapxh.put("Brush Mouse", R.drawable.brushmouse);
		fullImageHashmapxh.put("Deer Mouse", R.drawable.deermouse);
		fullImageHashmapxh.put("Virginia Opossum", R.drawable.opossum);
		fullImageHashmapxh.put("Vagrant Shrew", R.drawable.vagrantshrew);
		fullImageHashmapxh.put("Trowbridge Shrew", R.drawable.trowbridgeshrew);
		fullImageHashmapxh.put("Broad-footed Mole", R.drawable.broadfootedmole);
		fullImageHashmapxh.put("Pinyon Mouse", R.drawable.pinyonmouse);
		fullImageHashmapxh.put("California Vole", R.drawable.californiavole);
		fullImageHashmapxh.put("Norway Rat", R.drawable.norwayrat);
		fullImageHashmapxh.put("House Mouse", R.drawable.housemouse);
		fullImageHashmapxh.put("Red Fox", R.drawable.redfox);
		fullImageHashmapxh.put("Common Gray Fox", R.drawable.grayfox);
		fullImageHashmapxh.put("Common Raccoon", R.drawable.raccoon);
		fullImageHashmapxh.put("Long-tailed Weasel", R.drawable.weasel);
		fullImageHashmapxh.put("Wild Pig", R.drawable.pig);
		fullImageHashmapxh.put("American Badger", R.drawable.badger);
		fullImageHashmapxh.put("Striped Skunk", R.drawable.stripedskunk);
		fullImageHashmapxh.put("Ringtail Cat", R.drawable.ringtailcat);
		fullImageHashmapxh.put("Spotted Skunk", R.drawable.spottedskunk);
		fullImageHashmapxh.put("Shrew-Mole", R.drawable.shrewmole);
		fullImageHashmapxh.put("Black Rat", R.drawable.blackrat);
		fullImageHashmapxh.put("Merriam's Chipmunk", R.drawable.chipmunk);
		fullImageHashmapxh.put("Eastern Gray Squirrel", R.drawable.easterngraysquirrel);
		fullImageHashmapxh.put("Western Gray Squirrel", R.drawable.westerngraysquirrel);
		fullImageHashmapxh.put("Fox Squirrel", R.drawable.foxsquirrel);
		fullImageHashmapxh.put("Brush Rabbit", R.drawable.rabbit);
		//Reptile Images
		fullImageHashmapxh.put("Western Side-blotched Lizard", R.drawable.side_blotched_lizard);
		fullImageHashmapxh.put("Northern Rubber Boa", R.drawable.rubber_boa);
		fullImageHashmapxh.put("Western Yellow-bellied Racer ", R.drawable.racer);
		fullImageHashmapxh.put("California Striped Racer", R.drawable.california_whipsnake);
		fullImageHashmapxh.put("Forest Sharp-tailed Snake", R.drawable.forest_sharp_tailed_snake);
		fullImageHashmapxh.put("Northern Pacific Rattlesnake", R.drawable.northern_pacific_rattlesnake);
		fullImageHashmapxh.put("Ring-necked Snake", R.drawable.monterey_ring_necked_snake);
		fullImageHashmapxh.put("San Francisco Alligator Lizard", R.drawable.northern_alligator_lizard);
		fullImageHashmapxh.put("California Alligator Lizard", R.drawable.southern_alligator_lizard);
		fullImageHashmapxh.put("Common Kingsnake", R.drawable.common_king_snake);
		fullImageHashmapxh.put("California Mountain Kingsnake", R.drawable.california_mountain_kingsnake);
		fullImageHashmapxh.put("Coast Horned Lizard", R.drawable.coast_horned_lizard);
		fullImageHashmapxh.put("Pacific Gopher Snake", R.drawable.pacific_gopher_snake);
		fullImageHashmapxh.put("Skilton's Skink", R.drawable.western_skink);
		fullImageHashmapxh.put("Coast Range Fence Lizard", R.drawable.western_fence_lizard);
		fullImageHashmapxh.put("Santa Cruz Gartersnake", R.drawable.aquatic_garter_snake);
		fullImageHashmapxh.put("Coast Gartersnake", R.drawable.western_terrestrial_gartersnake);
		fullImageHashmapxh.put("Valley Gartersnake", R.drawable.common_gartersnake);
		//Amphibian Images
		fullImageHashmapxh.put("American Bullfrog", R.drawable.north_america_bullfrog);
		fullImageHashmapxh.put("Arboreal Salamander", R.drawable.arboreal_salamander);
		fullImageHashmapxh.put("Black Salamander", R.drawable.black_salamander);
		fullImageHashmapxh.put("California Giant Salamander", R.drawable.california_giant_salamander);
		fullImageHashmapxh.put("California Newt", R.drawable.california_newt);
		fullImageHashmapxh.put("California Slender Salamander", R.drawable.pacific_slender_salamander);
		fullImageHashmapxh.put("California Toad", R.drawable.california_toad);
		fullImageHashmapxh.put("Foothill Yellow-legged Frog", R.drawable.foothill_yellow_legged_frog);
		fullImageHashmapxh.put("Gabilan Mountains Slender Salamander", R.drawable.gabilan_slender_salamander);
		fullImageHashmapxh.put("Northern Red-legged Frog", R.drawable.california_red_legged_frog);
		fullImageHashmapxh.put("Rough-skinned Newt", R.drawable.rough_skinned_newt);
		fullImageHashmapxh.put("Sierran Treefrog", R.drawable.pacific_chorus_frog);
		fullImageHashmapxh.put("Yellow-eyed Ensatina", R.drawable.yellow_eyed_ensatina);

		
		
		
		//PortraitImages
		//Mammal Images
		portraitImageHashmapxh.put("Mule Deer", R.drawable.deer_portraitxh);
		portraitImageHashmapxh.put("Bobcat", R.drawable.bobcat_portraitxh);
		portraitImageHashmapxh.put("Mountain Lion", R.drawable.mountain_lion_portraitxh);
		portraitImageHashmapxh.put("Coyote", R.drawable.coyote_portraitxh);
		portraitImageHashmapxh.put("California Pocket Mouse", R.drawable.calpocketmouse_portraitxh);
		portraitImageHashmapxh.put("Dusky-footed Woodrat", R.drawable.woodrat_portraitxh);
		portraitImageHashmapxh.put("California Mouse", R.drawable.californiamouse_portraitxh);
		portraitImageHashmapxh.put("Botta's Pocket Gopher", R.drawable.bottagopher_portraitxh);
		portraitImageHashmapxh.put("California Ground Squirrel", R.drawable.groundsquirrel_portraitxh);
		portraitImageHashmapxh.put("Ornate Shrew", R.drawable.ornateshrew_portraitxh);
		portraitImageHashmapxh.put("Brush Mouse", R.drawable.brushmouse_portraitxh);
		portraitImageHashmapxh.put("Deer Mouse", R.drawable.deermouse_portraitxh);
		portraitImageHashmapxh.put("Virginia Opossum", R.drawable.opossum_portraitxh);
		portraitImageHashmapxh.put("Vagrant Shrew", R.drawable.vagrantshrew_portraitxh);
		portraitImageHashmapxh.put("Trowbridge Shrew", R.drawable.trowbridgeshrew_portraitxh);
		portraitImageHashmapxh.put("Broad-footed Mole", R.drawable.broadfootedmole_portraitxh);
		portraitImageHashmapxh.put("Pinyon Mouse", R.drawable.pinyonmouse_portraitxh);
		portraitImageHashmapxh.put("California Vole", R.drawable.californiavole_portraitxh);
		portraitImageHashmapxh.put("Norway Rat", R.drawable.norwayrat_portraitxh);
		portraitImageHashmapxh.put("House Mouse", R.drawable.housemouse_portraitxh);
		portraitImageHashmapxh.put("Red Fox", R.drawable.redfox_portraitxh);
		portraitImageHashmapxh.put("Common Gray Fox", R.drawable.grayfox_portraitxh);
		portraitImageHashmapxh.put("Common Raccoon", R.drawable.raccoon_portraitxh);
		portraitImageHashmapxh.put("Long-tailed Weasel", R.drawable.weasel_portraitxh);
		portraitImageHashmapxh.put("Wild Pig", R.drawable.pig_portraitxh);
		portraitImageHashmapxh.put("American Badger", R.drawable.badger_portraitxh);
		portraitImageHashmapxh.put("Striped Skunk", R.drawable.stripedskunk_portraitxh);
		portraitImageHashmapxh.put("Ringtail Cat", R.drawable.ringtailcat_portraitxh);
		portraitImageHashmapxh.put("Spotted Skunk", R.drawable.spottedskunk_portraitxh);
		portraitImageHashmapxh.put("Shrew-Mole", R.drawable.shrewmole_portraitxh);
		portraitImageHashmapxh.put("Black Rat", R.drawable.blackrat_portraitxh);
		portraitImageHashmapxh.put("Merriam's Chipmunk", R.drawable.chipmunk_portraitxh);
		portraitImageHashmapxh.put("Eastern Gray Squirrel", R.drawable.easterngraysquirrel_portraitxh);
		portraitImageHashmapxh.put("Western Gray Squirrel", R.drawable.westerngraysquirrel_portraitxh);
		portraitImageHashmapxh.put("Fox Squirrel", R.drawable.foxsquirrel_portraitxh);
		portraitImageHashmapxh.put("Brush Rabbit", R.drawable.rabbit_portraitxh);
		//Reptile Images
		portraitImageHashmapxh.put("Western Side-blotched Lizard", R.drawable.side_blotched_lizard_portraitxh);
		portraitImageHashmapxh.put("Northern Rubber Boa", R.drawable.rubber_boa_portraitxh);
		portraitImageHashmapxh.put("Western Yellow-bellied Racer ", R.drawable.racer_portraitxh);
		portraitImageHashmapxh.put("California Striped Racer", R.drawable.california_whipsnake_portraitxh);
		portraitImageHashmapxh.put("Forest Sharp-tailed Snake", R.drawable.forest_sharp_tailed_snake_portraitxh);
		portraitImageHashmapxh.put("Northern Pacific Rattlesnake", R.drawable.northern_pacific_rattlesnake_portraitxh);
		portraitImageHashmapxh.put("Ring-necked Snake", R.drawable.monterey_ring_necked_snake_portraitxh);
		portraitImageHashmapxh.put("San Francisco Alligator Lizard", R.drawable.northern_alligator_lizard_portraitxh);
		portraitImageHashmapxh.put("California Alligator Lizard", R.drawable.southern_alligator_lizard_portraitxh);
		portraitImageHashmapxh.put("Common Kingsnake", R.drawable.common_king_snake_portraitxh);
		portraitImageHashmapxh.put("California Mountain Kingsnake", R.drawable.california_mountain_kingsnake_portraitxh);
		portraitImageHashmapxh.put("Coast Horned Lizard", R.drawable.coast_horned_lizard_portraitxh);
		portraitImageHashmapxh.put("Pacific Gopher Snake", R.drawable.pacific_gopher_snake_portraitxh);
		portraitImageHashmapxh.put("Skilton's Skink", R.drawable.western_skink_portraitxh);
		portraitImageHashmapxh.put("Coast Range Fence Lizard", R.drawable.western_fence_lizard_portraitxh);
		portraitImageHashmapxh.put("Santa Cruz Gartersnake", R.drawable.aquatic_garter_snake_portraitxh);
		portraitImageHashmapxh.put("Coast Gartersnake", R.drawable.western_terrestrial_gartersnake_portraitxh);
		portraitImageHashmapxh.put("Valley Gartersnake", R.drawable.common_gartersnake_portraitxh);
		//Amphibian Images
		portraitImageHashmapxh.put("American Bullfrog", R.drawable.north_america_bullfrog_portraitxh);
		portraitImageHashmapxh.put("Arboreal Salamander", R.drawable.arboreal_salamander_portraitxh);
		portraitImageHashmapxh.put("Black Salamander", R.drawable.black_salamander_portraitxh);
		portraitImageHashmapxh.put("California Giant Salamander", R.drawable.california_giant_salamander_portraitxh);
		portraitImageHashmapxh.put("California Newt", R.drawable.california_newt_portraitxh);
		portraitImageHashmapxh.put("California Slender Salamander", R.drawable.pacific_slender_salamander_portraitxh);
		portraitImageHashmapxh.put("California Toad", R.drawable.california_toad_portraitxh);
		portraitImageHashmapxh.put("Foothill Yellow-legged Frog", R.drawable.foothill_yellow_legged_frog_portraitxh);
		portraitImageHashmapxh.put("Gabilan Mountains Slender Salamander", R.drawable.gabilan_slender_salamander_portraitxh);
		portraitImageHashmapxh.put("Northern Red-legged Frog", R.drawable.california_red_legged_frog_portraitxh);
		portraitImageHashmapxh.put("Rough-skinned Newt", R.drawable.rough_skinned_newt_portraitxh);
		portraitImageHashmapxh.put("Sierran Treefrog", R.drawable.pacific_chorus_frog_portraitxh);
		portraitImageHashmapxh.put("Yellow-eyed Ensatina", R.drawable.yellow_eyed_ensatina_portraitxh);
				

		
		//LandscapeImages
		//Mammal Images
		landscapeImageHashmapxh.put("Mule Deer", R.drawable.deer_landscapexh);
		landscapeImageHashmapxh.put("Bobcat", R.drawable.bobcat_landscapexh);
		landscapeImageHashmapxh.put("Mountain Lion", R.drawable.mountain_lion_landscapexh);
		landscapeImageHashmapxh.put("Coyote", R.drawable.coyote_landscapexh);
		landscapeImageHashmapxh.put("California Pocket Mouse", R.drawable.calpocketmouse_landscapexh);
		landscapeImageHashmapxh.put("Dusky-footed Woodrat", R.drawable.woodrat_landscapexh);
		landscapeImageHashmapxh.put("California Mouse", R.drawable.californiamouse_landscapexh);
		landscapeImageHashmapxh.put("Botta's Pocket Gopher", R.drawable.bottagopher_landscapexh);
		landscapeImageHashmapxh.put("California Ground Squirrel", R.drawable.groundsquirrel_landscapexh);
		landscapeImageHashmapxh.put("Ornate Shrew", R.drawable.ornateshrew_landscapexh);
		landscapeImageHashmapxh.put("Brush Mouse", R.drawable.brushmouse_landscapexh);
		landscapeImageHashmapxh.put("Deer Mouse", R.drawable.deermouse_landscapexh);
		landscapeImageHashmapxh.put("Virginia Opossum", R.drawable.opossum_landscapexh);
		landscapeImageHashmapxh.put("Vagrant Shrew", R.drawable.vagrantshrew_landscapexh);
		landscapeImageHashmapxh.put("Trowbridge Shrew", R.drawable.trowbridgeshrew_landscapexh);
		landscapeImageHashmapxh.put("Broad-footed Mole", R.drawable.broadfootedmole_landscapexh);
		landscapeImageHashmapxh.put("Pinyon Mouse", R.drawable.pinyonmouse_landscapexh);
		landscapeImageHashmapxh.put("California Vole", R.drawable.californiavole_landscapexh);
		landscapeImageHashmapxh.put("Norway Rat", R.drawable.norwayrat_landscapexh);
		landscapeImageHashmapxh.put("House Mouse", R.drawable.housemouse_landscapexh);
		landscapeImageHashmapxh.put("Red Fox", R.drawable.redfox_landscapexh);
		landscapeImageHashmapxh.put("Common Gray Fox", R.drawable.grayfox_landscapexh);
		landscapeImageHashmapxh.put("Common Raccoon", R.drawable.raccoon_landscapexh);
		landscapeImageHashmapxh.put("Long-tailed Weasel", R.drawable.weasel_landscapexh);
		landscapeImageHashmapxh.put("Wild Pig", R.drawable.pig_landscapexh);
		landscapeImageHashmapxh.put("American Badger", R.drawable.badger_landscapexh);
		landscapeImageHashmapxh.put("Striped Skunk", R.drawable.stripedskunk_landscapexh);
		landscapeImageHashmapxh.put("Ringtail Cat", R.drawable.ringtailcat_landscapexh);
		landscapeImageHashmapxh.put("Spotted Skunk", R.drawable.spottedskunk_landscapexh);
		landscapeImageHashmapxh.put("Shrew-Mole", R.drawable.shrewmole_landscapexh);
		landscapeImageHashmapxh.put("Black Rat", R.drawable.blackrat_landscapexh);
		landscapeImageHashmapxh.put("Merriam's Chipmunk", R.drawable.chipmunk_landscapexh);
		landscapeImageHashmapxh.put("Eastern Gray Squirrel", R.drawable.easterngraysquirrel_landscapexh);
		landscapeImageHashmapxh.put("Western Gray Squirrel", R.drawable.westerngraysquirrel_landscapexh);
		landscapeImageHashmapxh.put("Fox Squirrel", R.drawable.foxsquirrel_landscapexh);
		landscapeImageHashmapxh.put("Brush Rabbit", R.drawable.rabbit_landscapexh);
		//Reptile Images
		landscapeImageHashmapxh.put("Western Side-blotched Lizard", R.drawable.side_blotched_lizard_landscapexh);
		landscapeImageHashmapxh.put("Northern Rubber Boa", R.drawable.rubber_boa_landscapexh);
		landscapeImageHashmapxh.put("Western Yellow-bellied Racer ", R.drawable.racer_landscapexh);
		landscapeImageHashmapxh.put("California Striped Racer", R.drawable.california_whipsnake_landscapexh);
		landscapeImageHashmapxh.put("Forest Sharp-tailed Snake", R.drawable.forest_sharp_tailed_snake_landscapexh);
		landscapeImageHashmapxh.put("Northern Pacific Rattlesnake", R.drawable.northern_pacific_rattlesnake_landscapexh);
		landscapeImageHashmapxh.put("Ring-necked Snake", R.drawable.monterey_ring_necked_snake_landscapexh);
		landscapeImageHashmapxh.put("San Francisco Alligator Lizard", R.drawable.northern_alligator_lizard_landscapexh);
		landscapeImageHashmapxh.put("California Alligator Lizard", R.drawable.southern_alligator_lizard_landscapexh);
		landscapeImageHashmapxh.put("Common Kingsnake", R.drawable.common_king_snake_landscapexh);
		landscapeImageHashmapxh.put("California Mountain Kingsnake", R.drawable.california_mountain_kingsnake_landscapexh);
		landscapeImageHashmapxh.put("Coast Horned Lizard", R.drawable.coast_horned_lizard_landscapexh);
		landscapeImageHashmapxh.put("Pacific Gopher Snake", R.drawable.pacific_gopher_snake_landscapexh);
		landscapeImageHashmapxh.put("Skilton's Skink", R.drawable.western_skink_landscapexh);
		landscapeImageHashmapxh.put("Coast Range Fence Lizard", R.drawable.western_fence_lizard_landscapexh);
		landscapeImageHashmapxh.put("Santa Cruz Gartersnake", R.drawable.aquatic_garter_snake_landscapexh);
		landscapeImageHashmapxh.put("Coast Gartersnake", R.drawable.western_terrestrial_gartersnake_landscapexh);
		landscapeImageHashmapxh.put("Valley Gartersnake", R.drawable.common_gartersnake_landscapexh);
		//Amphibian Images
		landscapeImageHashmapxh.put("American Bullfrog", R.drawable.north_america_bullfrog_landscapexh);
		landscapeImageHashmapxh.put("Arboreal Salamander", R.drawable.arboreal_salamander_landscapexh);
		landscapeImageHashmapxh.put("Black Salamander", R.drawable.black_salamander_landscapexh);
		landscapeImageHashmapxh.put("California Giant Salamander", R.drawable.california_giant_salamander_landscapexh);
		landscapeImageHashmapxh.put("California Newt", R.drawable.california_newt_landscapexh);
		landscapeImageHashmapxh.put("California Slender Salamander", R.drawable.pacific_slender_salamander_landscapexh);
		landscapeImageHashmapxh.put("California Toad", R.drawable.california_toad_landscapexh);
		landscapeImageHashmapxh.put("Foothill Yellow-legged Frog", R.drawable.foothill_yellow_legged_frog_landscapexh);
		landscapeImageHashmapxh.put("Gabilan Mountains Slender Salamander", R.drawable.gabilan_slender_salamander_landscapexh);
		landscapeImageHashmapxh.put("Northern Red-legged Frog", R.drawable.california_red_legged_frog_landscapexh);
		landscapeImageHashmapxh.put("Rough-skinned Newt", R.drawable.rough_skinned_newt_landscapexh);
		landscapeImageHashmapxh.put("Sierran Treefrog", R.drawable.pacific_chorus_frog_landscapexh);
		landscapeImageHashmapxh.put("Yellow-eyed Ensatina", R.drawable.yellow_eyed_ensatina_landscapexh);

	}
	
	// returns the main HashMap
	public HashMap<String, Integer> getHashMap (){
		return this.fullImageHashmapxh;	
	}
	
	// returns the main HashMap
	public HashMap<String, Integer> getHashMapPortrait (){ return this.portraitImageHashmapxh; }
	
	// returns the main HashMap
	public HashMap<String, Integer> getHashMapLandscape (){
		return this.landscapeImageHashmapxh;	
	}
	
}
