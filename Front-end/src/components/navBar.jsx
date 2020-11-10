import React from "react";
import {
  BrowserRouter as Router,
  Switch,
  Route,
  Link,
  NavLink,
  useParams,
  useRouteMatch,
  Prompt,
} from "react-router-dom";

import Jumbotron from "react-bootstrap/Jumbotron";
import Container from "react-bootstrap/Container";
import Button from "react-bootstrap/Button";
import ButtonToolbar from "react-bootstrap/ButtonToolbar";
import { LinkContainer } from "react-router-bootstrap";

const About = () => <span>About</span>;

const Users = () => <span>Users</span>;

const NavBarIO = () => {
  return (
    <MemoryRouter>
      <Container className="p-3">
        <Jumbotron>
          <h1 className="header">Welcome To React-Bootstrap</h1>
          <h2>
            Current Page is{" "}
            <Switch>
              <Route path="/about">
                <About />
              </Route>
              <Route path="/users">
                <Users />
              </Route>
              <Route path="/">
                <Home />
              </Route>
            </Switch>
          </h2>
          <h2>
            Navigate to{" "}
            <ButtonToolbar className="custom-btn-toolbar">
              <LinkContainer to="/">
                <Button>Home</Button>
              </LinkContainer>
              <LinkContainer to="/about">
                <Button>About</Button>
              </LinkContainer>
              <LinkContainer to="/users">
                <Button>Users</Button>
              </LinkContainer>
            </ButtonToolbar>
          </h2>
        </Jumbotron>
      </Container>
    </MemoryRouter>
  );
};

const Header = () => {
  return (
    <>
      <NavLink exact activeClassName="active" to="/">
        Home
      </NavLink>
      <NavLink activeClassName="active" to="/">
        Products
      </NavLink>
      <NavLink activeClassName="active" to="/">
        Add Book
      </NavLink>
    </>
  );
};
const Content = (props) => {
  return (
    <Switch>
      <Route exact path="/">
        <Home />
      </Route>
      <Route path="/"></Route>
      <Route path="/"></Route>
      <Route path="*">
        <NoMatch />
      </Route>
    </Switch>
  );
};

const Home = () => {
  return <h2>Home</h2>;
};
const NoMatch = () => {
  return <p>There was no match</p>;
};
export default NavBarIO;
