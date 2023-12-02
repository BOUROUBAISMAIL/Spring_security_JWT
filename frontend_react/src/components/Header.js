import * as React from 'react';

export default function Header(props) {
  return (
    <header className="App-header">
      <h1 className="App-title">{props.pageTitle}</h1>
    </header>
  );
};