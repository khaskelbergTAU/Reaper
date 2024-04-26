package earth.terrarium.reaper.common.config;

import com.teamresourceful.resourcefulconfig.common.annotations.Comment;
import com.teamresourceful.resourcefulconfig.common.annotations.Config;
import com.teamresourceful.resourcefulconfig.common.annotations.ConfigEntry;
import com.teamresourceful.resourcefulconfig.common.config.EntryType;
import com.teamresourceful.resourcefulconfig.web.annotations.WebInfo;
import earth.terrarium.reaper.Reaper;

@Config(value = Reaper.MODID)
@WebInfo(
        title = "Reaper",
        description = "Reaper is a mod that adds a generator that can kill mobs and generate energy."
)
public final class ReaperConfig {
    @ConfigEntry(id = "soul_beacon_energy_cap", type = EntryType.INTEGER, translation = "config.reaper.soul_beacon_energy_cap")
    @Comment(value = "The maximum amount of energy the soul beacon can store.")
    public static int soulBeaconEnergyCap = 1000000;

    @ConfigEntry(id = "generator_energy_cap", type = EntryType.INTEGER, translation = "config.reaper.generator_energy_cap")
    @Comment(value = "The maximum amount of energy generator can store.")
    public static int genEnergyCap = 1000000;

    @ConfigEntry(id = "generator_energy_prod", type = EntryType.INTEGER, translation = "config.reaper.generator_energy_prod")
    @Comment(value = "The maximum range the generator can affect mobs.")
    public static int genEnergyProd = 80;

    @ConfigEntry(id = "generator_energy_prod_with_rune", type = EntryType.INTEGER, translation = "config.reaper.generator_energy_prod_with_rune")
    @Comment(value = "The amount of energy the generator produces per tick with the rune.")
    public static int genEnergyProdWithRune = 160;

    @ConfigEntry(id = "generator_max_range", type = EntryType.INTEGER, translation = "config.reaper.generator_max_range")
    @Comment(value = "The maximum range the generator can affect mobs.")
    public static int genMaxRange = 5;

    @ConfigEntry(id = "generator_max_range_with_rune", type = EntryType.INTEGER, translation = "config.reaper.generator_max_range_with_rune")
    @Comment(value = "The maximum range the generator can affect mobs with the rune.")
    public static int genMaxRangeWithRune = 8;

    @ConfigEntry(id = "generator_damage", type = EntryType.INTEGER, translation = "config.reaper.generator_damage")
    @Comment(value = "The amount of damage the generator deals to mobs. If this value is -1, the mob will die instantly.")
    public static int genDamage = 5;

    @ConfigEntry(id = "generator_damage_with_rune", type = EntryType.INTEGER, translation = "config.reaper.generator_damage_with_rune")
    @Comment(value = "The amount of damage the generator deals to mobs with the rune. If this value is -1, the mob will die instantly.")
    public static int genDamageWithRune = -1;

    @ConfigEntry(id = "generator_cooldown", type = EntryType.INTEGER, translation = "config.reaper.generator_cooldown")
    @Comment(value = "The cooldown of the generator.")
    public static int genCooldown = 120;

    @ConfigEntry(id = "generator_cooldown_with_rune", type = EntryType.INTEGER, translation = "config.reaper.generator_cooldown_with_rune")
    @Comment(value = "The cooldown of the generator with the rune.")
    public static int genCooldownWithRune = 60;
}
