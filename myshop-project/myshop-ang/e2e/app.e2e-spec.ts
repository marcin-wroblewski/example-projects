import { MyshopAngPage } from './app.po';

describe('myshop-ang App', () => {
  let page: MyshopAngPage;

  beforeEach(() => {
    page = new MyshopAngPage();
  });

  it('should display message saying app works', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('app works!');
  });
});
