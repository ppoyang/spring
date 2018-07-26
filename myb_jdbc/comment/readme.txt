[sp28] SQL 문 

create table board (
    mId number(4) primary key,
    mWriter varchar2(100),
    mContent varchar2(300)
    );
COMMIT;
create sequence board_seq;


