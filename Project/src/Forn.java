
public class Forn extends Electrodomestic {
    public int temperatura;
    public String autonetella;

    public Forn() {
    }

    public Forn(Forn target) {
        super(target);
        if (target != null) {
            this.temperatura = target.temperatura;
            this.autonetella = target.autonetella;
        }
    }

    @Override
    public Electrodomestic clone() {
        return new Forn(this);
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Electrodomestic) || !super.equals(object2)) return false;
        Forn cast2 = (Forn) object2;
        return cast2.temperatura == temperatura && cast2.autonetella.equals(autonetella);
    }
}