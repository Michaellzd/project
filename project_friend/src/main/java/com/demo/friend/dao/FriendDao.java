package com.demo.friend.dao;

import com.demo.friend.pojo.Friend;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface FriendDao extends JpaRepository<Friend,String> {
        public Friend findByUseridAndFriendid(String userid, String friendid);
    @Modifying
    @Query(value = "UPDATE tb_friend SET islike=? WHERE userid=? AND friendid=?",nativeQuery = true)
    public void updateislike(String islike, String userid, String friendid);

    @Modifying
    @Query(value = "delete  from  tb_friend  WHERE userid=? AND friendid=?",nativeQuery = true)
    void deleteFriend(String userid, String friendid);
}
