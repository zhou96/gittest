drop table filmInfo;
drop table filmtype;

-- Create table
create table FILMINFO --��Ӱ��Ϣ
(
  FILMID      NUMBER(8) primary key,
  FILMNAME    VARCHAR2(50 CHAR) not null,
  TYPEID      VARCHAR2(8 CHAR) not null,
  ACTOR       VARCHAR2(255 CHAR),
  DIRECTOR    VARCHAR2(50 CHAR),
  TICKETPRICE NUMBER(19) not null
);

-- Create table
create table FILMTYPE --��Ӱ����
(
  TYPEID   NUMBER(8) primary key,
  TYPENAME VARCHAR2(20)
);

drop sequence seq_filmType;
create sequence seq_filmType start with 10000;
insert into filmType values(seq_filmType.nextval, '����Ƭ');
insert into filmType values(seq_filmType.nextval, '����Ƭ');
insert into filmType values(seq_filmType.nextval, 'ϲ��Ƭ');
insert into filmType values(seq_filmType.nextval, 'ս��Ƭ');
insert into filmType values(seq_filmType.nextval, '�ƻ�Ƭ');
insert into filmType values(seq_filmType.nextval, '�ֲ�Ƭ');
insert into filmType values(seq_filmType.nextval, '����Ƭ');
insert into filmType values(seq_filmType.nextval, '����Ƭ');

drop sequence seq_filmInfo;
create sequence seq_filmInfo start with 100000;
insert into filmInfo values(seq_filmInfo.nextval, '������', 10005, '��ķ��������,��������������,�����ݡ�Τ��,�ǡ�Ħ��,���ȡ���¡��,�����ᡤ�����', 'ղķ˹����÷¡', 150);
insert into filmInfo values(seq_filmInfo.nextval, 'è������', 10007, '��ķ,����', 'William Hanna,Joseph Barbera', 60);
insert into filmInfo values(seq_filmInfo.nextval, '���С��', 10002, '����,������,���п�,����,�춬÷,������', '����', 50);
insert into filmInfo values(seq_filmInfo.nextval, '����̽����Ħ˹', 10002, 'С�޲��ء�����,�õ¡���', '�ǡ�����', 100);
insert into filmInfo values(seq_filmInfo.nextval, 'ȫ������', 10001, 'л����,��ѧ�� ,����Ӣ,�����u,������', '������,�¹���', 80);
insert into filmInfo values(seq_filmInfo.nextval, '�ھ���', 10005, 'ɳ���С�������,ղɭ���Ⲯ,���������ס���', '���������ķ����', 100);
insert into filmInfo values(seq_filmInfo.nextval, '������3', 10002, '����ά˹�ء�ʷ̩������ɭ��˹̹ɭ��÷��������ɭ�������ܣ���ŵ��ʩ�����񣬶ŷ������', '������ˡ���˹', 250);
select * from filmType;
select * from filmInfo;