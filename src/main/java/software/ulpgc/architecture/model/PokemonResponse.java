package software.ulpgc.architecture.model;

import java.util.List;

public record PokemonResponse(String name, List<AbilitySlot> abilities, List<TypeSlot> types) {
    public record AbilitySlot(Ability ability, int slot){}
    public record TypeSlot(int slot, Type type){}
    public record Ability(String name){}
    public record Type(String name){}
}
