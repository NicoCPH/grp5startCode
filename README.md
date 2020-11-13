# GRUPPE 5 startCode
<br>
Front end contains login
<br>
StartCode contains back end
<br>
Min indivuelle backend fungere sådan at du kan kalde en endpoint der hedder http://localhost:8080/jpareststarter/api/pets med et header x-access-token som har værdien: eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1c2VyIiwicm9sZXMiOiJ1c2VyIiwiZXhwIjoxNjA1MTg3MTA0LCJpYXQiOjE2MDUxODUzMDQsImlzc3VlciI6IkdydXBwZSA1IiwidXNlcm5hbWUiOiJ1c2VyIn0.2VEPJwDZvmBjzpZPSHbBD6kbNFpVKXL8RWMppeWAb04.<br>
Denne endpoint kræver du er user for at kunne tilgå det.
<br>
Jeg har lavet en entitet som hedder pets, som har en til mange relation til users, så en user kan få sig et pet.
<br>
Min individuelle frontend indeholder et externt kald til en server som henter eller helligdage i danmark via http://localhost:8080/jpareststarter/api/holidays. og derudover har jeg twistet det lidt så det bliver henter via en dropdown menu. og slettet et par småting.
<br>-

