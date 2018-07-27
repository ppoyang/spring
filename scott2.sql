create table board(
    mId number(4) primary key,
    mWiter varchar2(100),
    mContent varchar2(300)
);

commit;

create sequence board_seq;