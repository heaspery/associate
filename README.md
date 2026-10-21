# Associate
A simple CMS for small associations, built for the volunteers who run them.

## Why this project?

I have volunteered for two different associations, and both showed the same signals: very little IT knowledge and very limited resources.
Their needs are modest. Their websites get few visitors and little traffic. Yet the existing tools are either paid and limited, or far too complex for what they actually need.
This project aims to fill that gap: a website that does only what an association needs, and does it simply.

## Who is it for?

The people running an association are:

- Volunteers: they have little time.
- Non-technical: they have limited technical knowledge.
- Changing: active members come and go often.
- Non-profit: money is tight.

## So the solution has to be:

- Easy to use, with as little complexity as possible.
- Easy to hand over when the team changes.
- Cheap, to match the associations' means.
- Hosted locally, so the data stays local.
- Easy to adapt for several associations.
  
## Features (MOSCOW)

- Must: Home page, events page, contact, authentication, event management, custom domain name and dedicated email address.
- Should: Event registration, registration admin dashboard.
- Could: Integrated payments, project showcase, newsletter.
- Won't: Drag-and-drop editor.

## What each feature covers:

- Home page: who the association is, what it does, its values, and links to the rest of the site.
- Events page: upcoming and past events.
- Contact page: send an email to the association.
- Authentication: members log in to manage events.
- Registration: sign up for an event, read the event's registrations.
- Payment: pay for an event.
- Domain: a custom domain name and a dedicated email address.

## Roadmap

The project is built in iterations.

1. Must: home, events and contact pages, authentication, adding, editing and deleting events, and a custom domain name with a dedicated email address.
2. Should: event registration and the registration admin dashboard.
3. Could: payments, project showcase, newsletter.


## Architecture choices

### Four options were compared:

| Option | Examples | Drawbacks | Advantages | Cost | Ease of use for a volunteer | Ease of handover |
|---|---|---|---|---|---|---|
| Hosted website builder | Wix, Squarespace | Paid subscription, limited customization, platform dependency | Turnkey, no technical maintenance | Medium | High | Easy |
| Open-source CMS | WordPress | Complex interface, plugin and update maintenance | Established architecture, large ecosystem | Medium | Medium | Medium |
| **Custom monolithic CMS** | Laravel, SpringBoot | Coupled frontend and backend, less flexible | Simplicity, single deployment, easier authentication | Low | High | Easy if designed for it |
| Custom CMS with separate frontend / backend | React or Vue + API | More complex authentication, two applications to deploy | Flexibility, smooth interface | Low to medium | High | Easy if designed for it |


### Why a custom monolith?

- Hosted builders: paid, limited, and foreign services that store data abroad.
- Open-source CMS: too complex for such simple needs, relies on plugins, and is tedious to maintain.
- Separate frontend / backend: unnecessary for low-traffic sites that need simple hosting and authentication.
- Custom monolith: easy to host and maintain, with simple authentication. -> Chosen solution

### Tech stack
Java / Spring Boot

I already have experience with PHP and Laravel. I chose Java for this project to broaden my skills.

## Status

Work in progress : Iteration 1 under development.
