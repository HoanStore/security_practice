# SQL INJECTION 실습

- BAD CASE) SQL INJECTION에 노출됨

```java
@Select("SELECT * FROM member WHERE sex = ${sex}")
List<Member> findMemberBySex(String sex);
```
- 위처럼 작성하면 파라미터에 쿼리를 포함시킬 수 있음. 
- URL) http://localhost:8080/member?sex=1 OR 1=1


- GOOD CASE) #{} 키워드를 쓰면 파라미터를 모두 문자열로 변환함.
```java
@Select("SELECT * FROM member WHERE sex = #{sex}")
List<Member> findMemberBySex(String sex);
```


      
