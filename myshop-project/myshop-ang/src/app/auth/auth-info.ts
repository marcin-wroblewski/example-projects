export class AuthInfo {
    username: string;
    firstname: string;
    lastname: string;
    displayed: string;
    roles: string[];
    loggedIn: boolean;
}

export const ANONYMOUS: AuthInfo = {
    username: 'anonymous',
    firstname: '',
    lastname: '',
    displayed: 'Niezalogowany użytkownik',
    roles: [],
    loggedIn: false
}