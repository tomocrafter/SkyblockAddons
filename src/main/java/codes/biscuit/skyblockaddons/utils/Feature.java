package codes.biscuit.skyblockaddons.utils;

@SuppressWarnings({"deprecation", "DeprecatedIsStillUsed"})
public enum Feature {

    MAGMA_WARNING(0, Message.SETTING_MAGMA_BOSS_WARNING),
    DROP_CONFIRMATION(1, Message.SETTING_ITEM_DROP_CONFIRMATION),
    DISABLE_EMBER_ROD(2, Message.SETTING_DISABLE_EMBER_ROD_ABILITY),
    SHOW_BACKPACK_PREVIEW(3, Message.SETTING_SHOW_BACKPACK_PREVIEW),
    HIDE_BONES(4, Message.SETTING_HIDE_SKELETON_HAT_BONES),
    SKELETON_BAR(5, Message.SETTING_SKELETON_HAT_BONES_BAR),
    HIDE_FOOD_ARMOR_BAR(6, Message.SETTING_HIDE_FOOD_AND_ARMOR),
    FULL_INVENTORY_WARNING(7, Message.SETTING_FULL_INVENTORY_WARNING),
    MAGMA_BOSS_TIMER(8, Message.SETTING_MAGMA_BOSS_TIMER),
//    HIDE_DURABILITY(9, Message.SETTING_HIDE_DURABILITY), // removed
    SHOW_ENCHANTMENTS_REFORGES(10, Message.SETTING_ENCHANTS_AND_REFORGES),
    MINION_STOP_WARNING(11, Message.SETTING_MINION_STOP_WARNING),
    HIDE_AUCTION_HOUSE_PLAYERS(12, Message.SETTING_AUCTION_HOUSE_PLAYERS),
    HIDE_HEALTH_BAR(13, Message.SETTING_HIDE_HEALTH_BAR),
    DOUBLE_DROP_IN_OTHER_GAMES(14, null),
    MINION_FULL_WARNING(15, Message.SETTING_FULL_MINION),
    IGNORE_ITEM_FRAME_CLICKS(16, Message.SETTING_IGNORE_ITEM_FRAME_CLICKS),
    USE_VANILLA_TEXTURE_DEFENCE(17, Message.SETTING_USE_VANILLA_TEXTURE),
    SHOW_BACKPACK_HOLDING_SHIFT(18, Message.SETTING_SHOW_ONLY_WHEN_HOLDING_SHIFT),
    MANA_BAR(19, Message.SETTING_MANA_BAR),
    MANA_TEXT(20, Message.SETTING_MANA_TEXT),
    HEALTH_BAR(21, Message.SETTING_HEALTH_BAR),
    HEALTH_TEXT(22, Message.SETTING_HEALTH_TEXT),
    DEFENCE_ICON(23, Message.SETTING_DEFENCE_ICON),
    DEFENCE_TEXT(24, Message.SETTING_DEFENCE_TEXT),
    DEFENCE_PERCENTAGE(25, Message.SETTING_DEFENCE_PERCENTAGE),
    HEALTH_UPDATES(26, Message.SETTING_HEALTH_UPDATES), // Health updates all credit to DidiSkywalker#9975
    HIDE_PLAYERS_IN_LOBBY(27, Message.SETTING_HIDE_PLAYERS_IN_LOBBY),
    DARK_AUCTION_TIMER(28, Message.SETTING_DARK_AUCTION_TIMER),
    ITEM_PICKUP_LOG(29, Message.SETTING_ITEM_PICKUP_LOG),
    AVOID_PLACING_ENCHANTED_ITEMS(30, Message.SETTING_AVOID_PLACING_ENCHANTED_ITEMS),
    STOP_BOW_CHARGE_FROM_RESETTING(31, Message.SETTING_STOP_BOW_CHARGE_FROM_RESETTING),
    AVOID_BREAKING_STEMS(32, Message.SETTING_AVOID_BREAKING_STEMS),
    SHOW_DARK_AUCTION_TIMER_IN_OTHER_GAMES(33, null),
    SHOW_ITEM_ANVIL_USES(34, Message.SETTING_SHOW_ITEM_ANVIL_USES),
    PREVENT_MOVEMENT_ON_DEATH(35, Message.SETTING_PREVENT_MOVEMENT_ON_DEATH),
    SHOW_MAGMA_TIMER_IN_OTHER_GAMES(36, null),
    DONT_RESET_CURSOR_INVENTORY(37, Message.SETTING_DONT_RESET_CURSOR_INVENTORY),
    LOCK_SLOTS(38, Message.SETTING_LOCK_SLOTS),
    SUMMONING_EYE_ALERT(39, Message.SETTING_SUMMONING_EYE_ALERT),
    MAKE_ENDERCHESTS_GREEN_IN_END(40, Message.SETTING_MAKE_ENDERCHESTS_IN_END_GREEN),
    DONT_OPEN_PROFILES_WITH_BOW(41, Message.SETTING_DONT_OPEN_PROFILES_WITH_BOW),
    STOP_DROPPING_SELLING_RARE_ITEMS(42, Message.SETTING_STOP_DROPPING_SELLING_RARE_ITEMS),
    MAKE_BACKPACK_INVENTORIES_COLORED(43, Message.SETTING_MAKE_BACKPACK_INVENTORIES_COLORED),
    @Deprecated AVOID_BREAKING_BOTTOM_SUGAR_CANE(44, Message.SETTING_AVOID_BREAKING_BOTTOM_SUGAR_CANE), //disallowed
    REPLACE_ROMAN_NUMERALS_WITH_NUMBERS(45, Message.SETTING_REPLACE_ROMAN_NUMERALS_WITH_NUMBERS),
    CHANGE_BAR_COLOR_FOR_POTIONS(46, Message.SETTING_CHANGE_BAR_COLOR_WITH_POTIONS),
    CRAFTING_PATTERNS(47, Message.SETTING_CRAFTING_PATTERNS),
    FISHING_SOUND_INDICATOR(48, Message.SETTING_FISHING_SOUND_INDICATOR),
    AVOID_BLINKING_NIGHT_VISION(49, Message.SETTING_AVOID_BLINKING_NIGHT_VISION),
    MINION_DISABLE_LOCATION_WARNING(50, Message.SETTING_DISABLE_MINION_LOCATION_WARNING),
    JUNGLE_AXE_COOLDOWN(51, Message.SETTING_JUNGLE_AXE_COOLDOWN),
    ORGANIZE_ENCHANTMENTS(52, Message.SETTING_ORGANIZE_ENCHANTMENTS),
    REVENANT_INDICATOR(53, Message.SETTING_REVENANT_INDICATOR),
//    HIDE_HUD_BARS(41, null),

    WARNING_TIME(-1, Message.SETTING_WARNING_DURATION),

    ADD(-1, null),
    SUBTRACT(-1, null),

    ANCHOR_POINT(-1, Message.SETTING_ANCHOR_POINT),

    LANGUAGE(-1, Message.LANGUAGE),
    EDIT_LOCATIONS(-1, Message.SETTING_EDIT_LOCATIONS),
    RESET_LOCATION(-1, Message.SETTING_RESET_LOCATIONS),
    TEXT_STYLE(-1, Message.SETTING_TEXT_STYLE);

    private int id;
    private Message message;

    Feature(int id, Message settingMessage) {
        this.id = id;
        this.message = settingMessage;
    }

    public int getId() {
        return id;
    }

    public String getMessage(String... variables) {
        return message.getMessage(variables);
    }

    public static Feature fromId(int id) {
        for (Feature feature : values()) {
            if (feature.getId() == id) {
                return feature;
            }
        }
        return null;
    }
}
