package management;

import datastructures.maps.CustomHashMap;
import library.Member;
import library.Transaction;

public class MemberManager {
    private final CustomHashMap<String, Member> members;

    public MemberManager() {
        members = new CustomHashMap<>();
    }

    public void addMember(Member member) {
        if (member != null && !members.containsKey(member.getMemberId())) {
            members.put(member.getMemberId(), member);
        }
    }

    public Member getMember(String memberId) {
        return members.get(memberId);
    }

    public void recordTransaction(String memberId, Transaction transaction) {
        Member member = members.get(memberId);
        if (member != null) {
            member.addTransaction(transaction);
        }
    }

    public Transaction getLastTransaction(String memberId) {
        Member member = members.get(memberId);
        return (member != null) ? member.getLastTransaction() : null;
    }
}
