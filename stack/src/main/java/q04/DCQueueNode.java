package q04;

// 通过组合的方式拓展基类
public class DCQueueNode {
    private Pet pet;
    private Long count;

    public DCQueueNode(Pet pet, Long count) {
        this.pet = pet;
        this.count = count;
    }

    public Pet getPet() {
        return this.pet;
    }

    public String getPetType() {
        return this.pet.getPetType();
    }

    public Long getCount() {
        return this.count;
    }
}
